package demo2.ch3;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo2.ch3.config.MainConfig;

public class TestCap7 {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		System.out.println("IOC 启动完成");
		context.close();
	}
}
