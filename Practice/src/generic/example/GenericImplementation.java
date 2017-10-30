package generic.example;

public class GenericImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		double b=6.0;
		GenericExample<Integer,Double> ge= new GenericExample<Integer,Double>(a, b);
		System.out.println(ge.getData());
		System.out.println(ge.getData1());
		
	}

}
