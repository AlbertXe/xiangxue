package demo2.ch3.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component
public class Jeep {
	public Jeep() {
		System.out.println("jeep constructor");
	}
	@PostConstruct
	public void init(){
		System.out.println("init jeep");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("destroy jeep");
	}
}
