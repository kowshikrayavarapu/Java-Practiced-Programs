package practicejava;

import java.util.Arrays;

public class anagramStr {

	public static void main(String[] args) {
		String str1="LISTEN";				//we had taken the two strings
		String str2="SILENT";			
		char[]arr1=str1.toLowerCase().toCharArray();      //for the both strings first we are changing them into char array
		char[]arr2=str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);	         //after the changing into char array and then we have to sort the both the char arrays
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("BOTH THE STRINGS ARE ANAGRAM"); 	//after sorting both the arrays are equal then it is an anagram
		}else {
			System.out.println("BOTH THE STRINGS ARE NOT AN ANAGRAM");
		}
		
	}

}
