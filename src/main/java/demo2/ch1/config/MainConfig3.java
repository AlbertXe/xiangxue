package demo2.ch1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import demo2.ch1.Person;
import demo2.ch1.controller.OrderController;

@Configuration
public class MainConfig3 {
	@Bean // 默认方法名就是bean name;
	@Scope("prototype")
	public Person person(){
		return new Person("james", 20);
	}
}
