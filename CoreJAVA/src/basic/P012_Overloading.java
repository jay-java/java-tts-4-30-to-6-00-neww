package basic;
class Calculate{
	public int addition(int i, int j) {
		return i+j;
	}
	public int addition(int i, int j,int k) {
		return i+j+k;
	}
	public int addition(int i, int j,int k,int l) {
		return i+j+k+l;
	}
}
public class P012_Overloading {
	public static void main(String[] args) {
		Calculate c  =new Calculate();
	 	int res =  c.addition(1, 2, 3); 
	 	System.out.println(res);
	}
}
