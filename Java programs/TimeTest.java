import java.util.*;
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Time time1=new Time();
		Time time2=new Time();
		
		System.out.println("Enter the first time (In hours and minutes)");
		int firsthour=scanner.nextInt();
		int firstminute=scanner.nextInt();
		
		System.out.println("Enter the second time (In hours and minutes)");
		int secondhour=scanner.nextInt();
		int secondminute=scanner.nextInt();
		
		time1.setTime(firsthour, firstminute);
		time2.setTime(secondhour, secondminute);
		
		Time time3=new Time();
		time3=time3.sum(time1, time2);
		time3.showTime();

	}

}
