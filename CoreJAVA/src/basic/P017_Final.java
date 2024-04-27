package basic;
final class Data{
	final int i = 1;
	public void change() {
//		i++;
		System.out.println(i);
	}
	final public void calling() {
		System.out.println("calling function in data class");
	}
}
class Call extends Data{
	public void calling() {
		System.out.println("calling function in call class");
	}
}
public class P017_Final {
	public static void main(String[] args) {
		Data d = new Data();
		d.change();
	}
}
