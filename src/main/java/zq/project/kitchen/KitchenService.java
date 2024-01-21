package zq.project.kitchen;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KitchenService {

	@Autowired
	private KitchenDao kitchenDao;

	public KitchenMenu get() {
		return kitchenDao.get();
	}

}
