package basic;

class Emp {
	private int id;
	private String name;
	private double salary;

	Emp() {
		System.out.println("default cons");
	}

	Emp(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" salary : "+salary;
	}
}

public class P016_Encapsulation {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setId(1);
		e1.setName("java");
		e1.setSalary(4000);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1);
		Emp e2 = new Emp(2, "python", 3000);
		System.out.println(e2);
	}
}
