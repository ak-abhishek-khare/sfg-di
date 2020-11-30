package akguru.springframework.sfgdi.controllers;

import akguru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {

        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}