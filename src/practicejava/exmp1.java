package practicejava;
import java.util.*;

public class exmp1 {//here the program is about the removing the unneccessary symbols and in an string of line

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string with any symbols");
		String str=sc.nextLine();
		String cln="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9') || (ch==' ')){
				cln=cln+ch;
			}
		}
		System.out.println("cleaned string:"+cln);
	}

}
