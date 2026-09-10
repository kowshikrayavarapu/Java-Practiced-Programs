package practicejava;
public class TwoSum {
	public static void main(String[] args) {
		int arr[]= {3,2,8,9,7,11,15},target=9;
		int result[]=twoSum(arr, target);	//HERE THIS METHOD CHECKS IF ANY TWO NUMBERS MATCH THE TARGET THEN THE NUMBERS ARE STORED IN ARRAY AND THIS ARRAY METHOD RETURNS THE ARRAY AND RETURND ARRAY IS STORED IN RESULT[]ARRAY
		if(result.length==2) {	//HERE THIS CONDITION IS USED TO CHECK THE RETURNED ARRAY I.E IT CONTAINS ANY TWO NUMBERS IF CONTAINS PAIR IS FOUND AND STORE THEM IN 0 AND 1 INDEXS IF NOT PAIR NOT FOUND
			System.out.println("INDEXS ARE "+result[0]+ " AND " +result[1]);
		} else {
			System.out.println("NO PAIRS FOUND");
		}
	}
		//THIS IS THE METHOD FOR TWO SUM
		public static int[] twoSum (int arr[], int target) {
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i] + arr[j] == target) {
						return new int[] {i,j};
					}
				}
			}
			return new int[] {};
			
		}
	}

