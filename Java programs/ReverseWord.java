import java.util.Scanner;
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=sc.nextLine();
		String word[]=str.split(" ");
		String reverse="";
		int i,j;
		for(i=0;i<word.length;i++)
		{
			for(j=word[i].length()-1;j>=0;j--)
			{
				reverse=reverse+word[i].charAt(j);
			}
			System.out.print(reverse);
			reverse=" ";
		}

	}

}
