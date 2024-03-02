package zq.project.account;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface AccountDao {

	void create(Account param);

	Account get();

}
