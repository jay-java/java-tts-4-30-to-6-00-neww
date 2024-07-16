package collectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("collectionType/config.xml");
		User u =(User)con.getBean(User.class);
		System.out.println(u);
	}
}
