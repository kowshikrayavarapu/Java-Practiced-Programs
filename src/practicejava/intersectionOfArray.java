package practicejava;
import java.util.*;
public class intersectionOfArray {
	public static void main(String[] args) { 	//HERE THE INTERSECTION IS USED TO PRINT THE COMMON ELEMENTS IN BOTH THE ARRAYS
		int arr1[]= {1,2,3,5,6,7,8,9};
		int arr2[]= {5,6,7,8,0,0,0,0};
		Set<Integer> set=new HashSet<>();	//HERE WE USED HASH SET BECAUSE IT IS UESD TO REMOVE THE DUPLICATES
		for(int i=0;i<arr1.length;i++) {		//THIS LOOP IS FOR ARR1
			for(int j=0;j<arr2.length;j++) {		//THIS LOOP IS FOR ARR2
				if(arr1[i]==arr2[j]) {			//HERE IF THE IN BOTH ARRAY IT CHECKS THE COMMON ELEMENTS
					set.add(arr1[i]);		//AND THEM UNIQUE ELEMENTS
				}
			}
		}
		
			System.out.print("IN THE BOTH THE ARRAY THE COMMON ELEMENTS ARE : ");
			for(int values:set) {			//HERE THIS FOR EACH LOOP IS USED TO PRINT THE SET-> WHICH CONTAINS UNIQUE ELEMENTS IN THE SET 
			System.out.print(values+" ");
		}
	}
}
