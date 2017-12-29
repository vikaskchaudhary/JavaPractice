package generic.example;

public class GenericImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		double b=6.0;
		GenericExample<Integer,Double> ge= new GenericExample<Integer,Double>(a, b);
		System.out.println(ge.getData());
		System.out.println(ge.getData1());
		GenericExample<Double,Double> ge1= new GenericExample<Double,Double>(b, b);
		System.out.println(ge1.getData());
		System.out.println(ge1.getData1());
		GenericExample<Integer,Integer> ge2= new GenericExample<Integer,Integer>(a, a);
		System.out.println(ge2.getData());
		System.out.println(ge2.getData1());
		
	}

}
