package practicejava;
public class rightRotating {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int temp=arr[arr.length-1];	//5
		for(int i=arr.length-2;i>=0;i--) {	//why we taken length-2?-->because already temp have one lenght was decreased i.e arr.length is last one is empty
			arr[i+1]=arr[i];              //i=o i+1=>1 , i=1 i+1=>2 , i=2 i+1=>3 ; i=3 i+1=>4
		}
		arr[0]=temp;		//HERE WE ARE PLACING TEMP VALUE IN THE ARRAY INDEX OF(0) -->5
	for(int i=0;i<arr.length;i++) {
		//System.out.println("AFTER RIGHT ROTATION :" );
		System.out.println(arr[i]);
	}
  }
}
