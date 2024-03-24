package zq.project.kitchen.recipe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zq.project.kitchen.common.ResultMessage;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@PostMapping("/create")
	public ResultMessage<Recipe> create() {
		return ResultMessage.success(recipeService.get());
	}


	@GetMapping("/get")
	public ResultMessage<Recipe> getMenus() {
		return ResultMessage.success(recipeService.get());
	}

}
