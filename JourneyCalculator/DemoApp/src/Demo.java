import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the");
		int num=scan.nextInt();
		switch (num) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("mon");
			break;
		case 3:
			System.out.println("tus");
			break;
		case 4:
			System.out.println("wed");
			break;
		case 5:
			System.out.println("tha");
			break;
			
		case 6:
			System.out.println("fri");
			break;
		case 7:
			System.out.println("sat");
			break;
			default:
				System.out.println("yooooo");
		}
		

	}

}
