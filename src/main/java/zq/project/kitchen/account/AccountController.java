package zq.project.kitchen.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zq.project.kitchen.common.ResultMessage;

@RestController
@RequestMapping("/login")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@PostMapping("/register")
	public ResultMessage<Void> register(@RequestBody RegisterRequest request) {
		accountService.register(request);
		return ResultMessage.success();
	}

}
