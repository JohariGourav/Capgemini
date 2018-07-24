import java.util.*;
public class DistanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		Distance distance1=new Distance();
		Distance distance2=new Distance();
		
		System.out.println("Enter first distance (in feet and inches) :");
		int firstfeet=scanner.nextInt();
		float firstinches=scanner.nextFloat();
		
		System.out.println("Enter second distance (in feet and inches) :");
		int secondfeet=scanner.nextInt();
		float secondinches=scanner.nextFloat();
		
		distance1.set(firstfeet, firstinches);
		distance2.set(secondfeet, secondinches);
		
		Distance distance3=new Distance();
		distance3=distance3.add(distance1, distance2);
		distance3.disp();

	}

}
