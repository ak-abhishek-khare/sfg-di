package akguru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service  //telling that its a spring managed component and bring it into a Spring Context
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Abhishek!! ConstructorGreetingService";
    }
}
