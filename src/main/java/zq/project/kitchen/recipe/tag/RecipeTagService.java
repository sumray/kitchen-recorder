package zq.project.kitchen.recipe.tag;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zq.project.kitchen.recipe.Recipe;

@Service
public class RecipeTagService {

	@Autowired
	private RecipeTagDao recipeDao;

	public Recipe get() {
		return recipeDao.get();
	}

}
