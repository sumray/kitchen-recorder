package zq.project.kitchen.recipe;


import org.apache.ibatis.type.Alias;
import zq.project.kitchen.common.BaseEntity;

@Alias("Recipe")
public class Recipe extends BaseEntity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
