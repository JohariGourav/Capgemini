import java.util.*;
public class ComplexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		Complex firstnumber=new Complex();
		Complex secondnumber=new Complex();
		
		System.out.println("Enter the Real and Imaginary part of the first number : ");
			float firstreal=scanner.nextFloat();
			float firstimaginary=scanner.nextFloat();
		
		
		System.out.println("Enter the Real and Imaginary part of the second number : ");
			float secondreal=scanner.nextFloat();
			float secondimaginary=scanner.nextFloat();
		
			
		firstnumber.set(firstreal, firstimaginary);
		secondnumber.set(secondreal, secondimaginary);
		
		Complex thirdnumber=new Complex();
		thirdnumber= thirdnumber.sum(firstnumber,secondnumber);
		thirdnumber.disp();

	}

}
