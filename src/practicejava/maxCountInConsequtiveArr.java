package practicejava;
import java.util.*;
public class maxCountInConsequtiveArr{
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE");
		int num=sc.nextInt();
		System.out.println("ENTER THE ARRAY ELEMENTS");
		int arr[]=new int[num];
		int count=0,maxCount=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();		//HERE THIS IS USED T0 STORE THE ELEMENTS IN THE USER ARRAY
			if(arr[i] ==0) {		
				count++;				//HERE THIS CONDITION IS USED TO COUNT THE NUMBER OF ZEROS IN THE ARRAY
			}if(arr[i]==1) {
				maxCount++;				//HERE THIS CONDITION IS USED TO COUNT THE NUMBER OF ONES IN THE ARRAY
			}
		}
		System.out.println("-----------------------------------");
		System.out.println("IN THE ARRAY THE NO.OF ZERO'S ARE : "+count);
		System.out.println("IN THE ARRAY THE NO.OF ONE'S ARE : "+maxCount);
	}
}