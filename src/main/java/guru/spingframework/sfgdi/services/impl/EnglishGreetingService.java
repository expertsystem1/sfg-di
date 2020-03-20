package guru.spingframework.sfgdi.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.spingframework.sfgdi.services.GreetingService;

@Profile("EN")
@Service("i18Service")
public class EnglishGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hi man!";
	}

}
