import java.lang.annotation.Documented;

public class IncrDecr {
	//fkjdhfdhjfk
	static  int i=5;
	static {
		//i=3;
		i=i-- + --i;
		//i-- here i= 3 and so in memory ALU it will store first operand's value as 3 and then decrement to 2 so i=2
		// --i here i will be 1 since it's earlier value was 2
		// now it will perform arithmetic oper so 3 +1=4
	}
	{
		
		i=i-- + --i;
		System.out.println("Hello");
		//i++  here i= 4 store it for operation and then increment  to 5 so i=5
				// ++i here i will be 6 since it's earlier value was 5
				// now it will perform arithmetic oper so 4-6=-2
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(i);
		new IncrDecr();
		System.out.println(i);
		
	}
	
	

}
