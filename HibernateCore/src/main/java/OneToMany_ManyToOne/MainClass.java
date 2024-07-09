package OneToMany_ManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx  = session.beginTransaction();
		
		Owner1 o1 = new Owner1();
		o1.setId(1);
		o1.setName("java");
		
		Vehicle1 v1 = new Vehicle1();
		v1.setVid(1);
		v1.setModel("BMW");
		
		Vehicle1 v2 = new Vehicle1();
		v2.setVid(2);
		v2.setModel("Mercedes");
		
		Vehicle1 v3 = new Vehicle1();
		v3.setVid(3);
		v3.setModel("VOLVO");
		
		List<Vehicle1> vList = new ArrayList<Vehicle1>();
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);

		o1.setVehicles(vList);
		v1.setOwner(o1);
		v2.setOwner(o1);
		v3.setOwner(o1);
		
		session.save(o1);
		session.save(v1);
		session.save(v2);
		session.save(v3);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
