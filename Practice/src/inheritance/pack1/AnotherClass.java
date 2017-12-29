package inheritance.pack1;

public class AnotherClass extends Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FirstClass fc= new FirstClass(1);
//		fc.defaultMethod();
//		fc.protectedMethod();
//		fc.publicMethod();
	}

}
class First{
	private int k;
	protected int j;
}
class Second extends First{
	private int l;
	protected int m;
}