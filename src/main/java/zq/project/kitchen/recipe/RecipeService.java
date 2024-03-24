package zq.project.kitchen.recipe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zq.project.kitchen.recipe.tag.RecipeTagService;

import java.util.Date;

@Service
public class RecipeService {

	@Autowired
	private RecipeTagService tagService;

	@Autowired
	private RecipeDao recipeDao;

	public void create(CreateRecipeRequest request) {
		Recipe toDb = new Recipe();
		toDb.setName(request.getRecipeName());
		toDb.setTags(String.join(",", request.getTagNames()));
		toDb.setMode(request.getMode() == null ? RecipeMode.personal : request.getMode());
		toDb.setIngredients(request.getIngredients());
		toDb.setProcessDesc(request.getProcessDesc());
		toDb.setCreateTime(new Date());
		toDb.setUpdateTime(new Date());
		recipeDao.create(toDb);
		// TODO 多线程
		tagService.createIfNotExist(request.getTagNames());
	}

	public Recipe get() {
		return recipeDao.get();
	}

}
