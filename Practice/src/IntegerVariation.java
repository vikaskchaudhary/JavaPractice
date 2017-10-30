
public class IntegerVariation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer intObj= Integer.valueOf(args[args.length-1]);
		
		int i=intObj.intValue();
		if(args.length>1)
			System.out.println(i);
		if(args.length>0)
			System.out.println(i - 1);
		else
			System.out.println(i - 2);
	}

}
