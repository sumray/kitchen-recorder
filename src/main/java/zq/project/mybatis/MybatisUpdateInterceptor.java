package zq.project.mybatis;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import zq.project.common.BaseEntity;
import zq.project.common.IdGenerator;

import java.lang.reflect.Method;

@Component
@Intercepts(@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class}))
public class MybatisUpdateInterceptor implements Interceptor {

	@Autowired
	private IdGenerator idGenerator;

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		Method method = invocation.getMethod();
		BaseEntity entity = (BaseEntity) invocation.getArgs()[1];
		entity.setId(idGenerator.generate());
		return method.invoke(invocation.getTarget(), invocation.getArgs());
	}

}
