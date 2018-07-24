import java.util.*;
public class NameOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String arr[]= {"Dave","Ann","Gerge","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev","Kity","Merry","Smith","Johnson","Bill","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","Jackson"};
		System.out.println("Enter the name to be searched :");
		String name=sc.nextLine();
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(name.equals(arr[i]))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
