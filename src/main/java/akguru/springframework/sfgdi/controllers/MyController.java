package akguru.springframework.sfgdi.controllers;


import akguru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("Modified MyController for greeting service");
        return greetingService.sayGreeting();
    }

    /*public String sayHello(){
        System.out.println("Hi Abhishek!!!");
        return "Hi Folks!!!";
    }*/
}
