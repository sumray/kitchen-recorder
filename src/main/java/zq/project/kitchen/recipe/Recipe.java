package zq.project.kitchen.recipe;


import org.apache.ibatis.type.Alias;
import zq.project.kitchen.common.BaseEntity;

import java.util.Date;

// TODO 接口实现alias
@Alias("Recipe")
public class Recipe extends BaseEntity {

	private String name;

	private String tags;            // 逗号分隔

	private String ingredients;

	private String processDesc;

	private RecipeMode mode;

	private Date createTime;

	private Date updateTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getProcessDesc() {
		return processDesc;
	}

	public void setProcessDesc(String processDesc) {
		this.processDesc = processDesc;
	}

	public RecipeMode getMode() {
		return mode;
	}

	public void setMode(RecipeMode mode) {
		this.mode = mode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
