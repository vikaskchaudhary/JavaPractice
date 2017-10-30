
public class DivideAndConquer {
	
	public void printArray(int[][] arr)
	{
			
		for(int[] arrElm : arr)
		{
			for(int arrC: arrElm)
				System.out.print(arrC+"\t");
			System.out.println();
		}
		
	}
	
	
	
	public void divideNConquer(int[][] arr, int num)
	{
		int rowStart=0,colStart=0,rowEnd=arr.length,colEnd=arr[0].length;
		int count=0;
		for(int i=rowStart;i<rowEnd;i++)
		{
			for(int j=colStart;j<colEnd ;j++)
			{
				count++;
				if(num==arr[i][j])
				{
					System.out.println("Found at "+ i+" , "+j +" Looping count "+count);
					return;
				}
				/*if(num>arr[j][i])
				{
					rowStart++;
				}*/
				if(num<arr[i][j])
				{
					colEnd--;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivideAndConquer sp= new DivideAndConquer();
		int val=0;
		int row=4;
		int col=4;
		int[][] arr= {{10,20,30,40},{15,25,35,45},{17,27,37,39},{19,29,39,49}};//new int[row][col];
		/*for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				arr[i][j]=++val;*/
		//System.out.println(arr[0].length);
		
		sp.printArray(arr);
		sp.divideNConquer(arr,10);
		sp.divideNConquer(arr,20);
		sp.divideNConquer(arr,30);
		sp.divideNConquer(arr,40);
		sp.divideNConquer(arr,15);
		sp.divideNConquer(arr,25);
		sp.divideNConquer(arr,35);
		sp.divideNConquer(arr,45);
		sp.divideNConquer(arr,17);
		sp.divideNConquer(arr,27);
		sp.divideNConquer(arr,37);
		sp.divideNConquer(arr,47);
		sp.divideNConquer(arr,19);
		sp.divideNConquer(arr,29);
		sp.divideNConquer(arr,39);
		sp.divideNConquer(arr,49);
		
	}

}
