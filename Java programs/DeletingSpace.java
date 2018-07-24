import java.util.*;
public class DeletingSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String sentence=sc.nextLine();
		System.out.println("Word to be deleted :");
		String word=sc.nextLine();
		System.out.println("Position of the word:");
		int pos=sc.nextInt();
		String newsentence=RemoveSpace(sentence);
		System.out.println(newsentence);
		DeleteWord(newsentence,pos);
		

	}
	public static String RemoveSpace(String sentence)
	{
		int i;
		String temp="";
		for(i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)==' ' && sentence.charAt(i+1)==' ')
			{
				continue;
			}
			else
			{
				temp=temp+sentence.charAt(i);
			}
		}
		return temp;
	}
	public static void DeleteWord(String newsentence,int pos)
	{
		int i;
		String arr[]=newsentence.split(" ");
		for(i=pos-1;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		for(i=0;i<arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
