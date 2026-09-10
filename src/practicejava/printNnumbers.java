package practicejava;
import java.util.*;
public class printNnumbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		/* num=sc.nextInt();
		for(int i=0;i<=num;i++)
			System.out.println(i);//num*/
		
		//---------------------------------------
		//sum of the n digits
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
			System.out.println("For the the sum of "+i+" is: "+sum);
		}
		//System.out.println(sum);
	}
}
