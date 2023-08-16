import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the speed and time of the journy");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator JourneyCalculator=new JourneyCalculator();
		double distance=JourneyCalculator.CalculateDistance(speed, time);

		System.out.println(distance);
		

	}
}
	
	