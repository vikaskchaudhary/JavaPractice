package inheritance.pack1;

public class SubClass extends FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass fc= new SubClass();
		fc.defaultMethod();
		fc.protectedMethod();
		fc.publicMethod();
	}

}
