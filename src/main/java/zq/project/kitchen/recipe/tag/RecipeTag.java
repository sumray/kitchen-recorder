package zq.project.kitchen.recipe.tag;


import org.apache.ibatis.type.Alias;
import zq.project.kitchen.common.BaseEntity;

import java.util.Date;


@Alias("RecipeTag")
public class RecipeTag extends BaseEntity {

	private String name;

	private Date createTime;

	private Date updateTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
