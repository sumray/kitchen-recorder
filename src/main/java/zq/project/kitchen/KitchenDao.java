package zq.project.kitchen;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface KitchenDao {

	KitchenMenu get();

}
