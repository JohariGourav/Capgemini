//Searching in an unsorted Array
import java.util.Scanner;

public class UnsortSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };

		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. for searching");
		int num = sc.nextInt();
		int sz = arr.length;
		int counter = 0;
		//System.out.println(sz);

		for (int i = 0; i < sz; i++) {

			if (arr[i] == num) {

				System.out.println("NO. Found");
				counter++;
			}
		}
		
		if(counter ==0)
			System.out.println("No. not found");
	}
}
