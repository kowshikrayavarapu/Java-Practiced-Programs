package practicejava;
import java.util.*;
public class multiplicationTable {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE TABLE ");
		int num=sc.nextInt();
		System.out.println("ENTER UPTO NUMBER OF MULTIPLICATIONS");
		int itrs=sc.nextInt();
		System.out.println();
		System.out.println("------------------------------------>");
		System.out.println();
		System.out.println("HERE'S IS YOUR MULTIPLICATION TABLE ");
		System.out.println();
		for(int i=1;i<=itrs;i++) {
			System.out.println(num+ " X " + i + " = "+num*i);
		}
	}
}
