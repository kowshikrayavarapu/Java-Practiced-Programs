package practicejava;
public class rmvDupStr {
	public static void main(String[] args) {
		String str="RAYAVARAPU KRISHNA KOWSHIK";
		String result=" ";
		System.out.println("THE GIVEN STRING : " +str);
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(result.indexOf(ch)== -1) {
				result+=ch;
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.println("AFTER REMOVING THE DUPLICATES IN A STRING : "+result);
	}
}
