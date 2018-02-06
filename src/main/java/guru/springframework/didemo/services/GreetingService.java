package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

    @Override
    public String sayGreeting() {
        System.out.println("Hello");
        return "ok";
    }
}
