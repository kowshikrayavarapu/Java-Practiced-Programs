package practicejava;
import java.util.*;
public class BasicProgram1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER -->50");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==2) {
				System.out.println(i);
			}
		}
	}
}
