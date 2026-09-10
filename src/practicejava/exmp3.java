package practicejava;
import java.util.*;

public class exmp3 {
	public void userDeposit() {
		Scanner sc=new Scanner(System.in);
		//System.out.println("ENTER YOUR ACCOUNT NUMBER");
		long ac=866210110010749L;
		int pin=3344;
		if(ac==pin) {
			System.out.println("ENTER THE MONEY TO BE DEPOSITED");
			int deposit =sc.nextInt();
			System.out.println("AMOUNT DEBITED TO YOUR ACCOUNT :" +deposit);
		}
	}
}

