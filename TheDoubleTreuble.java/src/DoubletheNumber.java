import java.util.Scanner;

public class DoubletheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		System.out.println(doubleTheName(num));
		

	}
	public static int doubleTheName(int num) {
		return num*2;
	}

}
