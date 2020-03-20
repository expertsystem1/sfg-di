package guru.spingframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.spingframework.sfgdi.services.GreetingService;

@Controller
public class I18nController{
	
	
	private final GreetingService greetingService;
	
	
	public I18nController(@Qualifier("i18Service") GreetingService greetingService) {
		this.greetingService = greetingService;
	}


	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
