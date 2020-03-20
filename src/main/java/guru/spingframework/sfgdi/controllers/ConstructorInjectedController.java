package guru.spingframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.spingframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	

	private final GreetingService greetingService;
	
	
	public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
