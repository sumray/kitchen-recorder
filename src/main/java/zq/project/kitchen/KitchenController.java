package zq.project.kitchen;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KitchenController {

	@Autowired
	private KitchenService kitchenService;

	@GetMapping("/get")
	public KitchenMenu getMenus() {
		return kitchenService.get();
	}

}
