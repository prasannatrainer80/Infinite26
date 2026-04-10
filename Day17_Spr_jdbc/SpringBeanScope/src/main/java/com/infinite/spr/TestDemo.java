package com.infinite.spr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@ComponentScan("com.java.spr")
public class TestDemo {

	private String name;

	@Bean
	public String sayHello() {
		return "Hello " +name;
	}

}
