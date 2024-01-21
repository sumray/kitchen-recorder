package zq.project.kitchen;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface KitchenDao {

	@Select("select * from `Kitchen_MENU`")
	KitchenMenu get();

}
