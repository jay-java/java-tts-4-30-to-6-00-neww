package com.orm;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class DAO {
	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void saveUser(Model m) {
		this.hibernateTemplate.saveOrUpdate(m);
	}
	
	@Transactional
	public void deleteUser(int id) {
		Model m= this.hibernateTemplate.get(Model.class, id);
		this.hibernateTemplate.delete(m);
	}
	
	
	public Model getSingleUser(int id) {
		return this.hibernateTemplate.get(Model.class, id);
	}
	
	public List<Model> getAllUsers(){
		return this.hibernateTemplate.loadAll(Model.class);
	}
	
}
