package basic;
class User{
	int id;
	String name;
	String address;
	public User() {
		System.out.println("default cons");
	}
	public User(int id,String name,String address) {
		this.id=id;
		this.name = name;
		this.address = address;
		System.out.println("para cons : "+id);
	}
	public User(User u2) {
		this.id = u2.id;
		this.name = u2.name;
		this.address = u2.address;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("id : "+id);
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("name : "+name);
	}
	public void setAddress(String address) {
		this.address = address;
		System.out.println("address : "+address);
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
}
public class P010_Constructor {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setId(1);
		u1.setName("java");
		u1.setAddress("ahmedabad"); 
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		System.out.println(u1.getAddress());
		User u2 = new User(2, "python", "baroda");
		System.out.println(u2.getId());
		System.out.println(u2.getName());
		System.out.println(u2.getAddress());
		User u3 = new User(u2);
		System.out.println("u3 id : "+u3.getId());
		System.out.println("u3 name : "+u3.getName());
		System.out.println("u3 address : "+u3.getAddress());
	}
}
