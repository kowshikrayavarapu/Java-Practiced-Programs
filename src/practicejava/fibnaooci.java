package practicejava;
import java.util.*;
public class fibnaooci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the N value");
		int n=sc.nextInt();
		System.out.println("enter the A value");
		int a=sc.nextInt();
		System.out.println("enter the B value");
		int b=sc.nextInt();
		System.out.println("------------------------");
		for(int i=2;i<=n;i++) {
			int c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}	
	}
}
