package demo2.ch1;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo2.ch1.config.MainConfig2;

public class Cap2Test {
	@Test
	public void test01(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
		
		String[] names = context.getBeanDefinitionNames();//调用bean定义
		for (String name : names) {
			System.out.println(name);
		}
		
	}
}
