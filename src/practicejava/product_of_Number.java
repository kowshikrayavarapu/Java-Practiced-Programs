package practicejava;

public class product_of_Number {
	public static void main(String[]a) {
		int number=5245;
		int number1=5245;
		int product=1;
		while(number>0) {
			int digit=number%10;
			product*=digit;
			number/=10;
		}
		System.out.println("PRODUCT OF THIS " + number1 + " NUMBER IS :- " + product);
	}
}
