package consINjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("consINjection/config.xml");
		User u1 =(User)con.getBean(User.class);
		System.out.println(u1);
	}
}
