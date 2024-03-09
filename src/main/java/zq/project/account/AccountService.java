package zq.project.account;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AccountService {

	@Autowired
	private AccountDao accountDao;

	public void create(String account, AccountBindingType bindingType, String telephone, String email, Date updateTime) {
		Account toDb = new Account();
		toDb.setAccount(account);
		toDb.setBindingType(bindingType);
		toDb.setTelephone(telephone);
		toDb.setEmail(email);
		toDb.setUpdateTime(updateTime);
		toDb.setStatus(AccountStatus.NORMAL);
		toDb.setCreateTime(new Date());
		accountDao.create(toDb);
	}

	public void register(RegisterRequest request) {
		this.create(request.getAccount(), request.getBindingType(), request.getTelephone(), request.getEmail(), new Date());
	}

}
