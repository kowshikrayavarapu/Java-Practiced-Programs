package practicejava;
public class avgOfAnArr {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("THE SUM OF THE ARRAY IS : "+sum);
		System.out.println("-------------------------------");
		double avg= sum/arr.length;
		System.out.println("THE AVERAGE OF THE ARRAY IS : "+avg);
	}

}
