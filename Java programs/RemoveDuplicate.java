import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.nextLine();
		String output="";
		for(int i=0;i<input.length();i++)
		{
			int count=0;
			for(int j=0;j<output.length();j++)
			{
				if(input.charAt(i)==output.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				output=output+input.charAt(i);
			}
		}
		System.out.println(output);

	}

}
