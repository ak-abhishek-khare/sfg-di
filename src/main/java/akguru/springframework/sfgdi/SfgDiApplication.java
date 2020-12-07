package akguru.springframework.sfgdi;

import akguru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController ctrl = (MyController) ctx.getBean("myController"); //Spring instantiates
		// the object in Spring Context and with this line we request Context to return the instance.
		String s = ctrl.sayHello();
		System.out.println(s);

		System.out.println("...........Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println("...........Setter");
		System.out.println(setterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println("...........Constructor");
		System.out.println(constructorInjectedController.getGreeting());

		MyController myController = (MyController)ctx.getBean("myController");
		System.out.println(".............Primary Bean");
		System.out.println(myController.sayHello());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("...........PetController");
		PetController petController = ctx.getBean("petController",PetController.class);
		System.out.println("--------The Best Pet is........");
		System.out.println(petController.whichPetIsTheBest());

	}

}
