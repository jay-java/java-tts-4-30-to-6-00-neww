package ManyToMany;

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
		
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setE_name("java");

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setE_name("python");
		
		Project p1 = new Project();
		p1.setId(1);
		p1.setP_name("HRMS");
		

		Project p2 = new Project();
		p2.setId(2);
		p2.setP_name("BookS");
		
		List<Employee> emp_list = new ArrayList<Employee>();
		emp_list.add(e1);
		emp_list.add(e2);
		
		List<Project> pro_list = new ArrayList<Project>();
		pro_list.add(p1);
		pro_list.add(p2);
		
		e1.setPro_list(pro_list);
		e2.setPro_list(pro_list);
		
		p1.setEmp_list(emp_list);
		p2.setEmp_list(emp_list);
		
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
