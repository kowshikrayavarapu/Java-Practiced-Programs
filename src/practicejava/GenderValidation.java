package practicejava;
import java.util.*;

public class GenderValidation {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("GENDER:-");
		System.out.println("1. MALE ");
		System.out.println("2. FEMALE ");
		System.out.println("3. NOT PREFER TO SAY ");
		System.out.println("ENTER THE CHOICE IN 1,2,3");
		int num=sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("YOUR GENDER IS MALE! VERIFIED-> " + " HELLO SIR !");
			break;
		case 2:
			System.out.println("YOUR GENDER IS FEMALE! VERIFIED->" + " HELLO MADAM !");
			break;
		case 3:
			System.out.println("YOUR GENDER IS NOT TO PERFER! VERIFIED->" + " HELLO !");
			break;
			
		default:
			System.out.println("INVALID CHOICE");
		}
		
			
	}
}
