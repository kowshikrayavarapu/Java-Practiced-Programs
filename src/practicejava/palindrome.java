package practicejava;
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter the number");
		int num=2442,temp = num,rev=0;//this temp is used to store the reversed number (num) value once
		while(num!=0) {
			int ld=num%10;
			rev=rev*10+ld;
			num/=10;
		}
		if(temp==rev) {
			System.out.println("the given "+temp+" palindrome");
			
		}else {
			System.out.println("the given "+temp+" not a palindrome");
		}
		
	}

}
