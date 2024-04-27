package basic;
interface inter1{
	public void intertface1();
	public static void staticInINterface1() {
		System.out.println("static in interface 1");
	}
}
interface inter2 extends inter1{
	public void intertface2();
	public static void staticInINterface2() {
		System.out.println("static in interface 2");
	}
}
interface inter3{
	public void intertface3();
	public static void staticInINterface3() {
		System.out.println("static in interface 3");
	}
}
class InterCall implements inter2,inter3{

	@Override
	public void intertface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void intertface3() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void intertface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}
	
}
public class P018_Interface {
	public static void main(String[] args) {
		InterCall i = new InterCall();
		i.intertface1();
		i.intertface2();
		i.intertface3();
		inter1.staticInINterface1();
		inter2.staticInINterface2();
		inter3.staticInINterface3();
	}
}
