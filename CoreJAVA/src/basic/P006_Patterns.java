package basic;

public class P006_Patterns {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {//row
			for(int j=1;j<=5;j++) {//column
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=6;i++) {//row
			for(int j=1;j<=i;j++) {//column
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=6;i++) {//row
			for(int j=1;j<=i;j++) {//column
				System.out.print(i);
			}
			System.out.println();
		}
	
		for(int i=1;i<=6;i++) {//row
			for(int j=1;j<=i;j++) {//column
				System.out.print(j);
			}
			System.out.println();
		}

		for(int i=1;i<=6;i++) {//row
			for(int j=1;j<=i;j++) {//column
				if((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	
		
	}
}
