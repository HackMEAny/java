package com.example.basic.dependency_injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		// Human human = new Human(Air, Water, Food);
		ConfigurableApplicationContext configAppCon = SpringApplication.run(DependencyInjectionApplication.class, args);

		// Arrays.asList(configAppCon.getBeanDefinitionNames()).forEach(System.out::println);

		Human human = configAppCon.getBean(Human.class);
		human.live();
	}

}
