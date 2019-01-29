package demo2.ch1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demo2.ch1.Person;

@Configuration
public class MainConfig {
	@Bean("abc")  // 默认方法名就是bean name;
	public Person person(){
		return new Person("james", 20);
	}
}
