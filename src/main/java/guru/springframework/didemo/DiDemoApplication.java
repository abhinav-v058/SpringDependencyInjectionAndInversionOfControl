package guru.springframework.didemo;

import guru.springframework.didemo.controllers.GetterInjectedController;
import guru.springframework.didemo.controllers.MyControllers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyControllers controller = (MyControllers) ctx.getBean("myControllers");
		controller.hello();
		ctx.getBean(GetterInjectedController.class).sayHello();
	}
}
