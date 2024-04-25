package basic;
class Calc{
	static {
		System.out.println("static block in Calc class");
	}
	int id;
	String name;
	static String coll="GLS";
	public void chagne() {
//		i++;
//		System.out.println(i);
		System.out.println("change fun");
	}
	public static void staticFun() {
		System.out.println("static function");
	}
}
public class P015_StaticKeyword {
	static {
		System.out.println("static block in public class");
	}
	public static void main(String[] args) {
		Calc c = new Calc();
		c.chagne();
		Calc.staticFun();
	}
}
