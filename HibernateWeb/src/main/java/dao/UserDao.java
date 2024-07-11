package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();
	public void insertUser(User u) {
		session.save(u);
		tx.commit();
	}
	
	public User getUserById(int id) {
		User u= session.get(User.class, id);
		return u;
	}
	
	public void updateUser(User u) {
		session.update(u);
		tx.commit();
	}
	
	public void deleteUser(int id) {
		User u = session.get(User.class, id);
		session.delete(u);
	}
	
	public User loginUser(User u) {
//		String sql ="select * from table_name";
		String hql = "from User u where u.email=:email and u.password=:password";
		Query q = session.createQuery(hql);
		q.setParameter("email",u.getEmail());
		q.setParameter("password", u.getPassword());
		List<User> list = q.list();
		User user = list.get(0);
		return user;
	}
	
	
}
