package stringlunior.java;

import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first name");
		String a=scan.next();
		String b=scan.next();
		System.out.println(joinStrings(a,b));

	}
	public static String joinStrings(String str1, String str2) {
		return str1+" "+str2;
	}

}
