package practicejava;
import java.util.*;
public class Students_Marks {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int num =sc.nextInt();
		int [] arr=new int[num];
		int total=0;
		int result=75;
		System.out.println("Enter the 5 subjects marks");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			total+=arr[i];
		}
			int highest=arr[0];
			int lowest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>highest) {
				highest=arr[i];
			}
			if(arr[i]<lowest) {
				lowest=arr[i];
			}
		}
		System.out.println("==========================");
		if(result>=70) {
			System.out.println("Congratulations You Passed !");
		}else {
			System.out.println("Better Luck Next Time");
		}
		double avg=(double)total/arr.length;
		System.out.println("==========================");
		System.out.println("Average Marks : "+avg);
		System.out.println("==========================");
		System.out.println("Total   : "+total);
		System.out.println("==========================");
		System.out.println("Highest : "+highest);
		System.out.println("==========================");
		System.out.println("Lowest  : "+lowest);
		
	}
}
