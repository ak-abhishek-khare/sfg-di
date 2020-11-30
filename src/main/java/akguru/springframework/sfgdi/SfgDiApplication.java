package akguru.springframework.sfgdi;

import akguru.springframework.sfgdi.controllers.ConstructorInjectedController;
import akguru.springframework.sfgdi.controllers.MyController;
import akguru.springframework.sfgdi.controllers.PropertyInjectedController;
import akguru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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
	}

}
