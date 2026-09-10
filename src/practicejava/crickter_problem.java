package practicejava;
public class crickter_problem {
	public static void main(String[]a) {
		int arr[] = {1,4,6,0,2,1};
		int total=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			total+=arr[i];
			if(arr[i]==4 || arr[i]==6) {
				count++;
			}
		}
		double strike_rate=(double)total/arr.length*100;
		System.out.println("Total Runs Scored :- " +total);
		System.out.println("-----------------------------------");
		System.out.println("Strike rate is :- " +strike_rate);
		System.out.println("-----------------------------------");
		System.out.println("Number of Boundaries Scored :- "+count);
	}
}
