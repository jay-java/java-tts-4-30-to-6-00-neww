package basic;

import java.util.Scanner;

import aa.ABC;

public class P003_UserInput {
	public static void main(String[] args) {
		System.out.println("main function");
		ABC a = new ABC();
		a.call();
		a.run();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of i = ");
		int i = sc.nextInt();
		System.out.println("enter value of j = ");
		int j = sc.nextInt();
		System.out.println("addition of i and j = " + (i + j));

		System.out.println("enter base of tri : ");
		double base = sc.nextDouble();
		System.out.println("enter height of tri : ");
		double height = sc.nextDouble();
		double area = (base * height) / 2;
		System.out.println(area);

		System.out.println("enter radius : ");
		double radius = sc.nextDouble();
		double circleArea = Math.PI * radius * radius;
		System.out.println("area od circle  = " + circleArea);
	}
}
