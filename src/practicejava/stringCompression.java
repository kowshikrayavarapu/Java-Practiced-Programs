package practicejava;
public class stringCompression {
	public static void main(String[] args) {
		String str="aaabbbbccc";
		String cmp=compress(str);	//compress method to compress the string
		System.out.println(cmp);	//printing stmt
	}

	private static String compress(String str) {	//compress return method
		StringBuilder sb=new StringBuilder();
		int count=1;							  //this is used to count the equal charcters
		for(int i=0;i<str.length();i++) {
			if(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {	//previous one and present are equal then cout ++
				count++;
			}else {
				sb.append(str.charAt(i)); 	//add
				sb.append(count);	//add
				count=1;		//reset count for next charcters(i.e "b")
			}
		}
		return sb.toString();
	}

}
