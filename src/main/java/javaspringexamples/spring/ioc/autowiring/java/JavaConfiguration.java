package javaspringexamples.spring.ioc.autowiring.java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
@Configuration
public class JavaConfiguration {

	@Bean
	public UserService userService() {
		UserServiceImpl bean = new UserServiceImpl();
		bean.setUserDao(userDao());
		return bean;
	}

	@Bean
	@Qualifier
	public UserDao userDao() {
		UserDaoInMemoryImpl bean = new UserDaoInMemoryImpl();
		return bean;
	}
	
	@Bean
	public UserDao userJdbcDao() {
		UserDaoJdbcImpl bean = new UserDaoJdbcImpl();
		return bean;
	}
}
