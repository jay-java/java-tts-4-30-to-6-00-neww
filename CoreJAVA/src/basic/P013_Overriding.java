package basic;
class Person{
	public void walk() {
		System.out.println("human is walking");
	}
	public void sleep() {
		System.out.println("sleep");
	}
	public void eat() {
		System.out.println("eat");
	}
}
class Student extends Person{
	public void walk() {
		super.walk();
		System.out.println("student is walking");
	}
	public void study() {
		System.out.println("student studies");
	}
}
class Doctor extends Person{
	public void walk() {
		System.out.println("doctor is walking");
	}
	public void checkPatients() {
		System.out.println("doctor checks patients");
	}
}
public class P013_Overriding {
	public static void main(String[] args) {
		Student s = new Student();
		s.walk();
		s.walk();
		s.sleep();
		s.eat();
		s.study();
	}
}
