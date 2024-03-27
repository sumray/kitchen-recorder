package zq.project.kitchen.recipe;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface RecipeDao {

	void create(Recipe param);

	long queryCount(PageQueryRecipeRequest request);

	List<Recipe> queryRecipes(PageQueryRecipeRequest request);

	Recipe get();

}
