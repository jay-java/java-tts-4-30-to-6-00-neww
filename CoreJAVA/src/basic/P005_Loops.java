package basic;

import java.util.Scanner;

public class P005_Loops {
	public static void main(String[] args) {
		System.out.println("for loop");
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("while loop");
		int j = 1;
		while (j <= 5) {
			System.out.println(j);
			j++;

		}
		System.out.println("do while loop");
		int k = 10;
		do {
			System.out.println(k);
			k++;
		} while (k <= 5);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num : ");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}
}
