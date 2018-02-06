package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {

    @Autowired
    private IGreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(IGreetingService greetingService){
        this.greetingService = greetingService;
    }
}
