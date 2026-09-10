package practicejava;
import java.util.*;
public class linearSearch {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER FOR ARRAY SIZE");
		int num=sc.nextInt();
		int arr[]= new int[num];
		System.out.println("ENTER THE ARRAY ELEMENTS");
		int src=sc.nextInt();
		System.out.println("ENTER THE SEARCH NUMBER");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==src) {
				System.out.println("THE VALUE IS AT " + i + " INDEX");
			}
		}
		if(src!=0)
		System.out.println("THE VALUE IS NOT FOUND");*/
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int src=1;
		boolean found=false;
		for(int i=0;i<arr.length;i++) {		//HERE THIS IS WITH OUT USER INPUT
			if(arr[i]==src) {
				//System.out.println("THE VALUE IS FOUND AT " + i + " INDEX ");
				found =true;;
				System.out.println(found+ " -->THE VALUE IS FOUND AT " + i + " INDEX ");
				break;
			}
		}
		if(found == false) {
			System.out.println("THE VALUE " + src + " IS NOT FOUND");
		}
	}
}