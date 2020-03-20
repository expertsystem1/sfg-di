package guru.spingframework.sfgdi.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import guru.spingframework.sfgdi.services.GreetingService;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello World - PRIMARY";
	}

}
