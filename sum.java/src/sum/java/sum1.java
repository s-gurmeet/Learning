package sum.java;

import java.util.Scanner;

public class sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Two Number");
		Scanner s1=new Scanner(System.in);
		long num1=s1.nextLong();
		long num2=s1.nextLong();
		System.out.println(galacticAddition ( num1,  num2));
		

	}
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

}
