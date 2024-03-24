package zq.project.kitchen.recipe.tag;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface RecipeTagDao {

	void createIfNotExist(RecipeTag param);

	RecipeTag getByName(String tagName);

}
