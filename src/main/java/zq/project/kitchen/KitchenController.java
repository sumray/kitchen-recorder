package zq.project.kitchen;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zq.project.common.ResultMessage;

@RestController
public class KitchenController {

	@Autowired
	private KitchenService kitchenService;

	@GetMapping("/get")
	public ResultMessage<KitchenMenu> getMenus() {
		return ResultMessage.success(kitchenService.get());
	}

}
