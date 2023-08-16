import java.util.Scanner;
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter 2 number");
	    int  num1 =scan.nextInt();
		int num2= scan.nextInt();
		System.out.println(subtractNumbers( num1,  num2));
		System.out.println(multiplyNumbers( num1,  num2));
		System.out.println(divideNumbers( num1,  num2));
		System.out.println(findNumbers( num1,  num2));
		
		
		
		

	}
	
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}
	
	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	
	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}
	
	public static int findNumbers(int num1, int num2) {
		return num1%num2;
	}

}
