package basic;

import java.util.InputMismatchException;
import java.util.Scanner;
//try,catch,finally,throw,throws


class Divide{//A
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter a = ");
		int a  = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if(b>0) {
			int c = a/b;
			System.out.println(c);
		}
		else {
			throw new ArithmeticException();
		}
	}
}
public class P019_Exception {//B
	public static void main(String[] args) {
		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("should be greater than 0");
		}
		catch(InputMismatchException e) {
			System.out.println("should be numeric value");
		}
		
		
		
		
		
		
//		try {
//			Scanner sc  = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a  = sc.nextInt();
//			System.out.println("enter b = ");
//			int b = sc.nextInt();
//			int c = a/b;
//			System.out.println(c);
//			System.exit(0);
//		} catch (ArithmeticException e) {
//			System.out.println("denominator should be greater than 0");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("denominator should be numeric value");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will executes everytime");
//		}
	}
}
