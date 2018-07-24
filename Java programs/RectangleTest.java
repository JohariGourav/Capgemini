import java.util.*;
public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Rectangle firstrectangle=new Rectangle();
		Rectangle secondrectangle=new Rectangle();
		
		
		System.out.println("Enter the length of first rectangle: ");
		int firstlength=scanner.nextInt();
		
		System.out.println("Enter the breadth of first rectangle: ");
		int firstbreadth=scanner.nextInt();
		
		System.out.println("Enter the length of second rectangle: ");
		int secondlength=scanner.nextInt();
		
		System.out.println("Enter the breadth of second rectangle: ");
		int secondbreadth=scanner.nextInt();
		
		firstrectangle.setLength(firstlength);
		firstrectangle.setBreadth(firstbreadth);
		secondrectangle.setLength(secondlength);
		secondrectangle.setBreadth(secondbreadth);
		
		if(firstlength!=secondlength || firstbreadth!=secondbreadth)
		{
			if(firstrectangle.area()==secondrectangle.area())
			{
				System.out.println("The two Rectangles have same area which is "+firstrectangle.area());
			}
			else
			{
				System.out.println("The two Rectangles have different area :");
				System.out.println("The area of 1st Rectangle = "+firstrectangle.area());
				System.out.println("The area of 2nd Rectangle = "+secondrectangle.area());
			}
		}

	}

}
