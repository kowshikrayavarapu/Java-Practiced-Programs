package practicejava;
import java.util.*;
public class removeDup {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size");
		int num=sc.nextInt();
		int arr[]=new int[num];							//USING SCANNER CLASS
		int i=0;
		System.out.println("Enter the array elements");
		for(int j=0;j<num;j++) {
			arr[j]=sc.nextInt();
			if(arr[i] != arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		//System.out.println("THE ABOVE OUTPUT IS FROM USER INPUT");
		System.out.println("-------------------------");

		for(int k=0;k<=i;k++) {
			System.out.println(arr[k]+" ");
		}
		System.out.println("THE ABOVE OUTPUT IS FROM USER INPUT");
		System.out.println("-------------------------");
		/*System.out.println("BELOW OUTPUT IS FROM ANOTHER METHOD THAT IS WITHOUT USER INPUT");
		System.out.println("--------------------------------------------------------------");

		int arr1[]= {10,10,20,20,30},i1=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i1]<=arr[j]) {
				i1++;									//THIS IS THE ANOTHER METHOD FOR REMOVING DUPLICATES FROM THE ARRAY
				arr[i1]=arr[j];
			}
		}
		for(int k=0;k<i1;k++) {
			System.out.println(arr[k]+" ");
		}*/
	}
  }


