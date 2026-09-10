package practicejava;

public class secondMinimum {
	public static void main(String[]args) {
		int arr[]= {10,20,30,40,50,60,70,80};
		int min=arr[0];
		int secMin=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("THE FIRST MINIMUM NUMBER IN AN ARRAY IS :"+min);
		System.out.println("-----------------------------------------");
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=min && (secMin==min || secMin <min)) {
				secMin=arr[j];
			}
		}
		System.out.println("THE SECOND MINIMUM NUMBER IN AN ARRAY IS :"+secMin);
	}
}
