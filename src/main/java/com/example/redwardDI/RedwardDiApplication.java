package com.example.redwardDI;

import com.example.redwardDI.controllers.ConstructorInjectedController;
import com.example.redwardDI.controllers.ManualPropertyInjectedController;
import com.example.redwardDI.controllers.MyController;
import com.example.redwardDI.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RedwardDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(RedwardDiApplication.class, args);
		//now i can get any bean from the ctx
//		but it needs a cast
		//ALSO BEWARE !! bean alwais is class name.tolowecase()!!!!
		MyController controller= (MyController) ctx.getBean("myController");
		//now iu can use it pej:

		System.out.println(controller.sayHello());// this is primary bean now

		//no webserver just stops!! lightweight spring ;)

//		now lets do the same
//		with controllers that have manual injection
		System.out.println("-----------spring DI");
		ManualPropertyInjectedController manualController= (ManualPropertyInjectedController) ctx.getBean("manualPropertyInjectedController");
		System.out.println(manualController.sayHello());

		SetterInjectedController setterController= (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterController.getGreeting());

		ConstructorInjectedController constructorController= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorController.getGreeting());
	}

}
