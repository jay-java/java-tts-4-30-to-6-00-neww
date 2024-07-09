package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx  = session.beginTransaction();
		
		Owner o1 = new Owner();
		o1.setId(1);
		o1.setName("java");
		
		Owner o2 = new Owner();
		o2.setId(2);
		o2.setName("python");
		
		Vehicle v1 = new Vehicle();
		v1.setVid(1);
		v1.setModel("BMW");
		
		Vehicle v2 = new Vehicle();
		v2.setVid(2);
		v2.setModel("Mercedes");
		
		o1.setVehicle(v2);
		o2.setVehicle(v1);
		
		v1.setOwner(o2);
		v2.setOwner(o1);
		
		session.save(o1);
		session.save(o2);
		session.save(v1);
		session.save(v2);
		
		
		
		
		
		tx.commit();
		session.close();
		sf.close();
	}
}
