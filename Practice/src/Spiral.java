
public class Spiral {
	
	public void printArray(int[][] arr)
	{
		for(int[] arrElm : arr)
		{
			for(int arrC: arrElm)
				System.out.print(arrC+"\t");
			System.out.println();
		}
	}
	
	public void printSpiral(int[][] arr)
	{
		int rowEnd= arr.length-1, colEnd=arr[0].length-1;
		int rowStart=0, colStart=0;
		
		while(rowStart<rowEnd)
		{
			//Row static col increase
			for(int i=colStart;i<=colEnd;i++)
				System.out.print(arr[rowStart][i]+" ");
			rowStart++;
			//Col static row increase
			for(int i=rowStart;i<=rowEnd;i++)
				System.out.print(arr[i][colEnd]+" ");
			colEnd--;
			//Row static col decrease
			for(int i=colEnd;i>=colStart && colEnd>=0;i--)
				System.out.print(arr[rowEnd][i]+" ");
			rowEnd--;
			//Col static row decrease
			for(int i=rowEnd;i>=rowStart && rowEnd>=0;i--)
				System.out.print(arr[i][colStart]+" ");
			colStart++;
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spiral sp= new Spiral();
		int val=0;
		int row=4;
		int col=4;
		int[][] arr= new int[row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				arr[i][j]=++val;
		//System.out.println(arr[0].length);
		
		sp.printArray(arr);
		sp.printSpiral(arr);
	}

}
