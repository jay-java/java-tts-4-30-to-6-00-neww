package ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int id;
	private String e_name;
	@ManyToMany
	private List<Project> pro_list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public List<Project> getPro_list() {
		return pro_list;
	}
	public void setPro_list(List<Project> pro_list) {
		this.pro_list = pro_list;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", e_name=" + e_name + ", pro_list=" + pro_list + "]";
	}
	
}
