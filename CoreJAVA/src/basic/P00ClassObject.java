package basic;
class XYZ{
	public void call() {
		System.out.println("call inside xyz class");
	}
}
class ABC{
	public void call() {
		System.out.println("call inside abc class");
	}
}
public class P00ClassObject {
	public static void main(String[] args) {
		XYZ x = new XYZ();
		x.call();
		ABC a = new ABC();
		a.call();
	}
}