package guru.spingframework.sfgdi.services.impl;

import org.springframework.stereotype.Service;

import guru.spingframework.sfgdi.services.GreetingService;

@Service
public class SetterGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello World - Setter";
	}

}
