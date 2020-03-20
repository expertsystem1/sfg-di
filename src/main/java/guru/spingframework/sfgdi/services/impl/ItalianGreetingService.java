package guru.spingframework.sfgdi.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.spingframework.sfgdi.services.GreetingService;

@Profile({"IT","default"})
@Service("i18Service")
public class ItalianGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Ciao bello!";
	}

}
