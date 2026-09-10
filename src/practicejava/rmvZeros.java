package practicejava;
import java.util.*;
public class rmvZeros {
	public static void main(String[] args) {
		/*Scanner sc =new Scanner (System.in);
		System.out.println("ENTER THE ARRAY SIZE");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("ENTER THE ARRAY ELEMENTS"); 	// THIS PROGRAM WRITTEN METHOD IS IN SCANNER CLASS I.E USER INPUT
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]!=0) {
				System.out.println(arr[i]+" ");
			}
		}
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println(arr[i]+" ");
			}
		}*/
		int arr[]= {1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			//System.out.println("FROM THE ABOVE NUMBERS THE ZEROS ARE REMOVED");
			}
		System.out.println("FROM THE ABOVE NUMBERS THE ZEROS ARE REMOVED");
		System.out.println("-----------------------------------------");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				System.out.print(" "+arr[i]);		//THIS METHOD IS WRITTEN IN THE WITHOUT USER INPUT AND USING ONLY FOR LOOPS
		  }
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.print(" "+arr[i]);
			}
		}
		System.out.println(" -->"+"FINAL RESULT");
	}

}
