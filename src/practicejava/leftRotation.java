package practicejava;
public class leftRotation {
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};	//HERE WE HAD TAKEN THE ARRAY
		int temp=arr1[0];		//HERE THE TEMP STORES THE ARRAY INDEX 0TH VALUE THEN IN THE ARRAY OTH INDEX IT BECOMES EMPTY
		for(int i=1;i<arr1.length;i++) {		//HERE THIS LOOP START FROM THE ARRAY 1TH INDEX UPTO LAST INDEX
			arr1[i-1]=arr1[i]; 		//MINUSING THE ONE BY ONE ELEMENT IN THE ARRAY
		}
		arr1[arr1.length-1]=temp;		//HERE THIS LINE IS FOR WE HAVE TO KEEP THE TEMP -->ARRAY 0TH INDEX(1) AT THE LAST INDEX PLACE THEN THE VALUES IS AT LAST
		System.out.print("AFTER THE LEFT ROTATION WE GET : ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");		//AT LAST WE ARE PRINTING THE ARRAY OF THE LEFT ROTATED
		}
	}
}
