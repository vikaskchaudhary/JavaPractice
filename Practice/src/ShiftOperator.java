
public class ShiftOperator {

	
	public static int  leftShift(int val1, int shiftBy)
	{
		return val1 << shiftBy;
	}
	public static int  rightShift(int val,int shiftBy)
	{
		return val >> shiftBy;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(leftShift(3, 5));
	System.out.println(rightShift(10, 2));
	}

}
