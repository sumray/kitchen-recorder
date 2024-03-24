package zq.project.kitchen.recipe;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

	@Autowired
	private RecipeDao recipeDao;

	public Recipe get() {
		return recipeDao.get();
	}

}
