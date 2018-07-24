import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=sc.nextInt();
		System.out.println("Enter the array (only one no should be left)");
		int arr[]= new int[n];
		int sum=0,total=0,i,j;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		for(i=0;i<=n;i++)
		{
			total=total+i;
		}
		int miss=total-sum;
		System.out.println("The missing no. is "+ miss);

	}

}
