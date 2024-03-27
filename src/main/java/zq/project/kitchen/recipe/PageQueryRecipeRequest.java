package zq.project.kitchen.recipe;

import org.apache.ibatis.type.Alias;
import zq.project.kitchen.common.PageRequest;

import java.util.Date;

@Alias("PageQueryRecipeRequest")
public class PageQueryRecipeRequest extends PageRequest {

	private String name;

	private Date startCreateTime;

	private Date endCreateTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartCreateTime() {
		return startCreateTime;
	}

	public void setStartCreateTime(Date startCreateTime) {
		this.startCreateTime = startCreateTime;
	}

	public Date getEndCreateTime() {
		return endCreateTime;
	}

	public void setEndCreateTime(Date endCreateTime) {
		this.endCreateTime = endCreateTime;
	}

}
