package zq.project.kitchen.recipe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import zq.project.kitchen.common.PageResult;
import zq.project.kitchen.common.ResultMessage;
import zq.project.kitchen.exception.BaseException;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@PostMapping("/create")
	public ResultMessage<Void> create(@RequestBody CreateRecipeRequest request) {
		validate(request);
		recipeService.create(request);
		return ResultMessage.success();
	}

	private void validate(CreateRecipeRequest request) {
		if (!StringUtils.hasLength(request.getRecipeName())) {
			throw new BaseException("食谱名称不可为空");
		}
		if (request.getMode() == null) {
			throw new BaseException("请设置分享模式");
		}
		if (!CollectionUtils.isEmpty(request.getTagNames())) {
			if (request.getTagNames().size() > 10) {
				throw new BaseException("一个食谱最多只能有10个标签");
			}
			if (request.getTagNames().stream().anyMatch(s -> s.length() > 10)) {
				throw new BaseException("标签长度不能超过10个字");
			}
		}
		if (!StringUtils.hasLength(request.getIngredients())) {
			throw new BaseException("食材不可为空");
		}
		if (request.getIngredients().length() > 150) {
			throw new BaseException("食材描述请小于150字");
		}
		if (!StringUtils.hasLength(request.getProcessDesc())) {
			throw new BaseException("请描述制作过程");
		}
		if (request.getProcessDesc().length() > 2000) {
			throw new BaseException("食材描述请小于2000字");
		}
	}

	@PostMapping("/mine")
	public ResultMessage<PageResult<Recipe>> getMyRecipe(@RequestBody PageQueryRecipeRequest request) {
		return ResultMessage.success(recipeService.pageQueryRecipes(request));
	}

}
