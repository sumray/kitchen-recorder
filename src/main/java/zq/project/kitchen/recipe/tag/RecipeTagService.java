package zq.project.kitchen.recipe.tag;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class RecipeTagService {

	@Autowired
	private RecipeTagDao recipeDao;


	public void createIfNotExist(List<String> tagNames) {
		for (String name : tagNames) {
			RecipeTag toDb = new RecipeTag();
			toDb.setName(name);
			toDb.setCreateTime(new Date());
			recipeDao.createIfNotExist(toDb);
		}
	}

}
