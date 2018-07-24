import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int n=sc.nextInt();
		int temp=n,sum=0;
		while(n>0)
		{
			int x=n%10;
			n=n/10;
			sum=(sum*10)+x;
		}
		if(temp==sum)
			System.out.println("No. is Palindrome.");
		else
			System.out.println("No. is not a Palindrome.");

	}

}
