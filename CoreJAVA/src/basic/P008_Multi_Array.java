package basic;

import java.util.Scanner;

public class P008_Multi_Array {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		for(int r=0;r<arr.length;r++) {
			for(int c=0;c<arr.length;c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num of rows = ");
		int row = sc.nextInt();
		System.out.println("enter num of col = ");
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print("enter ele at a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
