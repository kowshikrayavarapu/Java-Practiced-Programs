package practicejava;
import java.util.*;
public class perfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER TO CHECK IT IS PERFECT NUMBER OR NOT");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num/2;i++) 
		{
			if(num%i==0) 
			{
			sum+=i;
			}
		}
		if(sum == num && num!=0) 
		{
			System.out.println("PERFECT NUMBER");
		}
		else 
		{
			System.out.println("NOT A PERFECT NUMBER");
		}
	}
}
