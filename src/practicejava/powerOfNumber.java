package practicejava;

import java.util.*;
public class powerOfNumber {
	public static void main(String []args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("ENTER THE EXPONENT VALUE");
	int base=sc.nextInt();
	System.out.println("ENTER THE BASE VALUE");
	int exponent=sc.nextInt();
	
	int result =(int)Math.pow(exponent, base);
	System.out.println("----------------------->");
	System.out.println("THE POWER OF THE VALUE : "+result);
	}
}
