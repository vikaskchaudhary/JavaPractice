
public class printSum {

	
	public int sum(int ...num)
	{
		int sum=0;
		for(int n:num)
		{
			sum+=n;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSum ps = new printSum();
		int[] a= new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i].toString());
		}
		
		System.out.println("Sum of all num is :- "+ps.sum(a));
		System.out.println("Sum for three num is :- "+ps.sum(1,2,3));
	}

}
