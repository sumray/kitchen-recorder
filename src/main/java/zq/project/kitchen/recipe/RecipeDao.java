package zq.project.kitchen.recipe;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface RecipeDao {

	Recipe get();

}
