package guru.spingframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.spingframework.sfgdi.services.impl.ConstructorGreetingService;

public class SetterInjectedControllerTest {
	
	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
		
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
