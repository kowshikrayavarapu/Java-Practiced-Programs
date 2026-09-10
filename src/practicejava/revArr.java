package practicejava;
import java.util.Arrays;
public class revArr {
	public static void main(String[] args) {
		int arr[]= {50,40,30,20,10};
		System.out.println("ACTUAL ARRAY");
		for(int i=0;i<arr.length;i++) {
			//System.out.println("ACTUAL ARRAY");
			System.out.println(arr[i]);
		}
		System.out.println("-------------------");//USING FOR LOOP METHOD FOR REVERSE THE ARRAY :-METHOD 1
		System.out.println("REVERSED ARRAY");
		for(int j=arr.length-1;j>=0;j--) {
			//System.out.println("REVERSED ARRAY");
			System.out.println(arr[j]);
		}
		System.out.println("-------------------");
		int arra[]= {5,4,3,2,1};
		int i1=0,k=arr.length-1,temp;
		while(i1<k) {
			temp=arra[i1];
			arra[i1]=arra[k];	//THIS IS THE ONE OF THE METHOD TO REVERSE THE ARRAY USING REAL ONE SWAPPING METHOD
			arra[k]=temp;
			i1++;
			k--;
		}
		System.out.println("USING SWAPPING METHOD TO REVERSE THE ARRRAY");
		//System.out.println("");
		System.out.println("THE ACTUAL GIVEN ARRAY IS : [5,4,3,2,1]");
		System.out.println(Arrays.toString(arra));
	}
}
