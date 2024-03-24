package zq.project.kitchen.recipe.tag;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import zq.project.kitchen.recipe.Recipe;

@Component
@Mapper
public interface RecipeTagDao {

	Recipe get();

}
