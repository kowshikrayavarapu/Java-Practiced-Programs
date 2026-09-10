package practicejava;
import java .util.*;
public class sumOfNevenNumbers {
	public static void main(String[]args) {
		//int arr[]= {1,2,3,4,5,6,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the another number");
		int num1=sc.nextInt();
		int sum=0;
		int even = 0;
		int max=0;
		//System.out.println("HERE THIS THE SUM OF THE N EVEN NUMBERS IN AN ARRAY");
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("THE SUM OF THE EVEN NUMBERS WHICH ARE UPTO " +num+ " IS : "+sum);
		System.out.println("------------------------------------------------------");
			for(int i1=1;i1<=num1;i1++) {
				if(i1%2==0) {
					even++;
				}
			}
		System.out.println("IN THE ABOVE SUM IS UPTO " +even+ " EVEN NUMBERS ");
	}
}
