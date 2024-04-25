package basic;
class A{
	A(){
		System.out.println("default cons");
	}
	public void call() {
		System.out.println("call function in A class");
	}
}
class B extends A{
	public void run() {
		System.out.println("run function in B class");
	}
}

class C extends B{
	public void cClassFun()
	{
		System.out.println("c class function");
	}
}

class Electronics{
	public void elecFunction() {
		System.out.println("elec class function");
	}
}
class Computer extends Electronics{
	
}
class Laptop extends Electronics{
	
}
class TV extends Electronics{
	
}
public class P011_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.call();
		b.run();
		C c  = new C();
		c.call();
		c.run();
		c.cClassFun();
	}
}
