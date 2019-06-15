package test.service;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	ApplicationContext ac;
	@Before//调之前初始化
	public void init() {
		String[] conf = { "conf/spring-mvc.xml", "conf/spring-mybatis.xml"};
		ac = new ClassPathXmlApplicationContext(conf);
	}
	

}
