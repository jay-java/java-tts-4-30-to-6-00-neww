package basic;

public class P009_String {
	public static void main(String[] args) {
		//StringBuffer
		//StringBuilder
		char c[] = {'J','A','V','A'};
		System.out.println(c);
		String name ="java developer";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(10));
		String s1 = "java";
		String s2 = "JAVA";
		System.out.println(s1);
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3 = "			java    ";
		System.out.println(s3.trim());
		String s4 = "    ";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());
	}
}
