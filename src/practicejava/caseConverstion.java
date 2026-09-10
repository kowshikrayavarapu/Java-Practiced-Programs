package practicejava;
public class caseConverstion {
	public static void main(String[] args) {
		String str="Rayavarapu Krishna KOWSHIK";
		String upper=" ";
		String lower=" ";
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				upper+=(char)(ch-32);
			}else {
				upper+=ch;
			}
			if(ch>='A' && ch<='Z') {
				lower+=(char)(ch+32);
			}else {
				lower+=ch;
			}
		}
		System.out.println("UPPER CASE : " +upper);
		System.out.println("lower case : " +lower);
	}

}
