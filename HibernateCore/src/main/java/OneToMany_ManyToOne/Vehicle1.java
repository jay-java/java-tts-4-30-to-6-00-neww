package OneToMany_ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "vehicle_data")
public class Vehicle1 {
	@Id
	private int vid;
	private String model;
	@ManyToOne
	private Owner1 owner;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Owner1 getOwner() {
		return owner;
	}

	public void setOwner(Owner1 owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", model=" + model + ", owner=" + owner + "]";
	}

}
