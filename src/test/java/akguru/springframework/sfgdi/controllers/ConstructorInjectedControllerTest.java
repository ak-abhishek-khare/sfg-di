package akguru.springframework.sfgdi.controllers;

import akguru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
        constructorInjectedController.getGreeting();
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}