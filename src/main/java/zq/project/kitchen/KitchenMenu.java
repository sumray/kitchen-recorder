package zq.project.kitchen;

import org.apache.ibatis.type.Alias;

@Alias("KitchenMenu")
public class KitchenMenu {

	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
