package basic;

import java.util.ArrayList;
import java.util.List;

class Employees{
	private int id;
	private String name,address;
	private double salary;
	private long contact;
	public Employees(int id,String name,String address,double salary,long contact) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", contact="
				+ contact + "]";
	}
	
}
public class P025_ListPractical {
	public static void main(String[] args) {
		Employees e1 = new Employees(1, "java", "ahmedaad", 50000.00, 98765431);
		Employees e2 = new Employees(2, "python", "ahmedaad", 50000.00, 98765431);
		Employees e3 = new Employees(3, "php", "ahmedaad", 50000.00, 98765431);
		Employees e4 = new Employees(4, ".net", "ahmedaad", 50000.00, 98765431);
		Employees e5 = new Employees(5, "javascript", "ahmedaad", 50000.00, 98765431);
		List<Employees> list  = new ArrayList<Employees>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println(list);
		for(Employees e:list) {
			System.out.println(e);
		}
	}
}
