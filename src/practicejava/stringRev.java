package practicejava;
import java.util.*;
public class stringRev {
	public static void main(String[] args) {
		String name="KRISHNA KOWSHIK";
		String lw= name.toLowerCase();
		String name1=new String("RAYAVARAPU");
		String rev="";
		
		for(int i=lw.length()-1;i>=0;i--) {
			rev+=lw.charAt(i);
		}
		System.out.println(rev);
		String revs=new StringBuilder(name1).reverse().toString().toLowerCase();
		System.out.println(revs);
	}
}
