package practicejava;
import java.util.*;
public class unionArr {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,3,4,4,5};
		int arr2[]= {1,2,2,3,4,5,5};
		Set< Integer > set=new HashSet<>();		//HERE THE HASH SET IS USED TO REMOVE DUPLICATE AND STORE THE UNIQUE VALUES IN THE ARRAY AND THEMM IN TO ARRAY
		for(int i=0;i<arr1.length;i++) {	// HERE THIS IS THE FIRST LOOP IS USED TO ACCESS THE FIRST ARRAY LOOP
			set.add(arr1[i]);		//HERE THIS ADD IS USED TO REMOVE DU[LICATES IN THE ARRAY1 AND ADD THE UNIQUE VALUES TO THE ARRAY
		}
		for(int i=0;i<arr2.length;i++) {  // HERE THIS IS THE FIRST LOOP IS USED TO ACCESS THE FIRST ARRAY LOOP
			set.add(arr2[i]);	//HERE THIS ADD IS USED TO REMOVE DU[LICATES IN THE ARRAY1 AND ADD THE UNIQUE VALUES TO THE ARRAY
		}
		for(int values :set) {		//THIS FOR EACH LOOP IS USED TO PRINT SET WHERE THE SET OF ARRAY NUMBER ARE STORED IN THE VALUES VARIABLE SO AFTER THAT WE PRINT THE VALUES VARIABLE
			System.out.println(values); 
		}
	}

}
