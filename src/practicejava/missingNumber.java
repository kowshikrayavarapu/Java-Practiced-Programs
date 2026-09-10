package practicejava;
public class missingNumber {
	public static void main(String[] args) {
		int arr1[]= {1,2,4,5,6}; 	//HERE WE HAD TAKEN AN ARRAY
		int n=6,sum=0;			//HERE THE N-> MEANS UPTO WHERE WE HAD TAKEN THE ARRAY NUMBERS AND SUM-> IS FOR SUMMING THE ARRAY
		int totalSum=n*(n+1)/2;		//HERE IT IS THE MAIN LOGIC OF THE CODE THAT IS N INTEGER NUMBER "FORMULA -->N*(N+1)/2
		for(int i=0;i<arr1.length;i++) {
			sum+=arr1[i]; 			//HERE IT IS USED TO SUM OF THE ARRAY
		}
		int missedValue=totalSum-sum; 	//HERE WE TAKEN NEW VALUE THAT WE HAVE SUBTRACT THE ARRAY SUM WITH THE FORMULA(TOTALSUM)
		System.out.println("IN THE ARRAY THE MISSED VALUE IS : " +missedValue);
		System.out.println("AND SUM OF THE ARRAY IS : "+sum);
	}

}
