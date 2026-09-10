package practicejava;
import java.util.*;
public class BasicProgram {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			if(i==5) {
				System.out.println("JAVA PROGRAMMER");
				continue;
			}else {
				System.out.println("KRISHNA KOWSHIK");
			}
		}
	}
}
