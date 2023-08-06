package com.example.redwardDI;

import com.example.redwardDI.controllers.MyController;
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

		String greeting=controller.sayHello(); //without even having endpoint!! remember __invoke
		System.out.println(greeting);

		//no webserver just stops!! lightweight spring ;)

	}

}
