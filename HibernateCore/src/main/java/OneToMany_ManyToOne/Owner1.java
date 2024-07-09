package OneToMany_ManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="owner_data")
public class Owner1 {
	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Vehicle1> vehicles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Vehicle1> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle1> vehicles) {
		this.vehicles = vehicles;
	}
	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", vehicles=" + vehicles + "]";
	}
	
}
