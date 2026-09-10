package practicejava;
import java.util.*;
public class countDigits {
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
		}
		System.out.println("The given number contains "+count + " digits");*/
		int n=1234;
		int num=1234;//taken casually to print n taken numbers in s.o.p
		int count=0;
		while(n!=0) {	//here this program is used to tell the program about the count digits in a number
			count++;
			n/=10;
		}
		System.out.println(num+" contains " +count+ " digits");
	}
}
