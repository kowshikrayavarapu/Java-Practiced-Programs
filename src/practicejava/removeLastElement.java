package practicejava;
public class removeLastElement {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		int removeIndex=1;
		int newArr[]= new int[arr.length-1];
		for(int i=0,j=0;i<arr.length;i++) {
			if(i == removeIndex) {
				continue;
			}
			newArr[j]=arr[i];
			j++;
		}
		for(int k=0;k<newArr.length;k++) {
			System.out.println(newArr[k]+" ");
		}
	}

}
