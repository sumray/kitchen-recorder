package zq.project.account;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zq.project.common.ResultMessage;

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
