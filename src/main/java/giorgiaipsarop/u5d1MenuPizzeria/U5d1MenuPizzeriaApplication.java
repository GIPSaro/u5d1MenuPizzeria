package giorgiaipsarop.u5d1MenuPizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5d1MenuPizzeriaApplication {

	public static void main(String[] args) {

        SpringApplication.run(U5d1MenuPizzeriaApplication.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1MenuPizzeriaApplication.class);
        Menu m = (Menu) ctx.getBean("menu");

        m.printMenu();
        ctx.close();
	}



}
