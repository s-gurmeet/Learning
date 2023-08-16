import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter the number");
       int marks= scan.nextInt();
       System.out.println("welcome to kodnest");
       greet(marks);
       
	}
	
	public static void greet(int marks) {
	if(marks>=80) {
		System.out.println("Welcome to techclub");
	}

}
}

