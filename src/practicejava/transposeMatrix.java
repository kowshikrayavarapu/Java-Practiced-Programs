package practicejava;
public class transposeMatrix {
	public static void main(String[] args) {
		int matrix[][]= {
				{1,2,3,4},
				{5,6,7,8}
				};
		int rows=matrix.length;
		int columns=matrix[0].length;
		for(int j=0;j<columns;j++) 
		{
			for(int i=0;i<rows;i++) 
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	  }
	}
