package practicejava;
import java.util.*;

public class StringToggle {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE UPPER OR LOWER CASE CHARCTERS");
		String str=sc.nextLine();
		String result=" ";
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				result+=Character.toLowerCase(ch);
			}
			if(Character.isLowerCase(ch)) {
				result+=Character.toUpperCase(ch);
			}
			
		}
		System.out.println("---------------------------------------->");
		System.out.println("HERE'S THE STRING WHICH IS TOGGLED : " +result);
	}
}
