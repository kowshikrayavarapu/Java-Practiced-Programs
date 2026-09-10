package practicejava;

public class productOfArray {
	public static void main(String[]args) {
		int arr[]= {-1,2,3,4};
		int product=1;
		for(int i=1;i<=arr.length-1;i++) {
			product*=arr[i];
		}
		System.out.println(product);
	}
}
