package basic;

//1.assignment-> =,+=,-=,/=,*=
//2.Arithmetic->+,-,*,/,%
//3.Conditional-> ==,<,>,<=,>=,!=
//4.Unary->++,--
//6.Logical -> &&, || , !
public class P002_Operators {
	public static void main(String[] args) {
		int i = 12;
		i += 13; // i = i-value
		System.out.println(i);
		int a = 12, b = 11;
		System.out.println(a);
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(a > b);
		a++; // a = a+1
		System.out.println("a = "+a);
		b = a++;//13
		System.out.println("b = "+b);
		System.out.println(a);
		int c = a++;//14
		System.out.println("c = "+c);
		
		
	}
}
