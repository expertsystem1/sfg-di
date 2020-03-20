package guru.spingframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.spingframework.sfgdi.services.impl.ConstructorGreetingService;

public class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;
	
	@BeforeEach 
	void setUp() {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}