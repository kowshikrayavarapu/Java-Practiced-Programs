package practicejava;

public class secondLargest {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90};
		int max=arr[0];
		int secMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("THE FIRST LARGEST NUMBER IN THE ARRAY : "+max);
		System.out.println("---------------------------------------");
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>secMax && arr[j]!=max) {
					secMax=arr[j];
				}
			}
			System.out.println("THE SECOND LARGEST NUMBER IN THE ARRAY : "+secMax);

		}
	}
