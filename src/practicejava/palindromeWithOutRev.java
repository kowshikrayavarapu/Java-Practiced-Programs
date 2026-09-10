package practicejava;
public class palindromeWithOutRev {
	public static void main(String[]args) { 
	String str="madam";	//take a string 
	int start=0;			//string start at first character
	int end=str.length()-1;		//upto last letter
	boolean isPalindrome =true;		//boolean method that is ISPALINDROME i.e wheather it is true or false
	
	while(start < end) 				//run upto condition not staisfys
	{    
		if(str.charAt(start) != str.charAt(end))  //so inthis start and end we had already taken the indexs place as a intance variables
		{
			isPalindrome=false;        //so in this last char and first charcter is not matching than it says plainfrome failed
			break;
		}
			start ++; 			//here if not matches or if condtion not satisfed than it increments the start poistion to 1,2,3,4
			end--;			//here it come in decrement order by in decresing so that the string get reverse 
	}
		if(isPalindrome) {		//here it is checks the palindrome or not
			System.out.println("THE STRING IS A PALINDROME");
			System.out.println("---------THANK YOU------- ");
		}
		else {
			System.out.println("THE STRING IS NOT AN PALINDROME");
			System.out.println("----------THANK YOU------------");
		}
    }
}
