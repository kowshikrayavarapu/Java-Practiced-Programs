package practicejava;
public class firstNonRepatingChar {
	public static void main(String[] args) {
		String str="RAYAVARAPU KRISHNA KOWSHIK ";
		for(int i=0;i<str.length();i++) {		// this loop runs upto last and checks
			char ch=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {   //this loop is to check how many char's will match 
				if(ch==str.charAt(j)) {   //	if matched than it is incrementing the count
					count++;
				}
			}
		if(count==1) {			//main logic of this problem is this condition i.e which char has the one as count 1 and that 
								//char should be first coming char in the string(str)
			System.out.println("THIS IS THE FIRST NON REPEATING CHARACTER : "+ch);
			break;				//this is for printing the only one char otherwise it prints all the counts of one chars
		}
	 }
   }
 }

