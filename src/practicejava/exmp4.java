package practicejava;
import java.util.*;
public class exmp4 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter the number to be reversed");
		//long num=sc.nextLong();
		/*for(int i=0;i<=num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}*/
		/*long rev=0;
		while(num!=0) {
			long digit=num%10;
			rev=rev*10 +digit;
			num/=10;
		}
		System.out.println(rev);*/
		long num=987654321;
		long n=987654321;
		long rev=0;
		while(num!=0) {
			long dig=num%10;//this program is about the how to reverse the number
			rev=rev*10+dig;
			num/=10;
		}
		System.out.println("For this ----> " +n+" the reversed number is :"+rev);
		
	}
}
