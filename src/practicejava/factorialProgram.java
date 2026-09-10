package practicejava;
import java.util.*;
public class factorialProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the factorial number");
		int fact =sc.nextInt();
		for(int i=1;i<num;i++) {
			fact*=i;
			System.out.println(fact);
			
		}
	}

}
