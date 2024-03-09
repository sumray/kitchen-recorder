package zq.project.mybatis;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zq.project.common.IdGenerator;

@Configuration
public class MybatisAutoConfiguration {

	@Bean
	public IdGenerator idGenerator() {
		return new IdGenerator(1L, 1L);
	}

}
