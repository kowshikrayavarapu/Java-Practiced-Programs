package practicejava;
import java.util.*;
public class armstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt(),temp=num,sum=0;
		while(num!=0) {
			int dig=num%10;
			sum+=dig*dig*dig;
			num/=10;
		}
		if(sum==temp) {
			System.out.println("The number is armstrong number");
		}else {
			System.out.println("The number is not an armstrong number");
		}
	}
}
