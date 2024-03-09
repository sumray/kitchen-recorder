package zq.project.kitchen;

import org.apache.ibatis.type.Alias;
import zq.project.common.BaseEntity;

@Alias("KitchenMenu")
public class KitchenMenu extends BaseEntity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
