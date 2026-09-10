package practicejava;
public class maxNumber {
	public static void main(String[] args) {
		int arr[]= {-1,1,2,3,4,5,6,7,8};
		int sum=0;
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];				//the loop is to find the sum of the array
		}
		System.out.println("The sum of the array is : " +sum);
		System.out.println("-------------------------");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {			//this block of code is used to find the maximum number in the array
				max=arr[i];
			}
		}
		System.out.println("The maximum number in the given array is: "+max);
		System.out.println("-----------------------------------");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {		//this block of code is used to find the minimum in the array
				min=arr[i];
			}
		}
		System.out.println("The minimun number in the given array is : "+min);
		System.out.println("------------------------------------------");
		System.out.println("MAXIMUM :" +max+  " SUM :"+sum+  " MINIMUM :"+min);
	}

}
