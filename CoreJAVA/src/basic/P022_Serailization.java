package basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentData implements Serializable{
	private int id;
	private String name,address;
	private long contact;
	public StudentData(int id,String name,String address,long contact) {
		this.id = id;
		this.name=name;
		this.address = address;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" address : "+address+" contact : "+contact;
	}
}
public class P022_Serailization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		StudentData s1 = new StudentData(1, "nixi", "ahmedabad", 98765423);
//		FileOutputStream fos = new FileOutputStream("student.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(s1);
//		oos.flush();
//		oos.close();
//		System.out.println("student object written");
		
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentData s1 = (StudentData)ois.readObject();
		System.out.println(s1);
		
		
	}
	
}
