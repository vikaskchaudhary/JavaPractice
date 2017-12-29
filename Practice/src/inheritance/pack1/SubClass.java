package inheritance.pack1;

public class SubClass extends FirstClass {
	
	SubClass(){
		super(10);
		System.out.println(super.getClass().getSimpleName());
	}
	void defaultMethod()
	{
		System.out.println("Default method of "+this.getClass().getName());
	}
	public void privateMethod()
	{
		System.out.println("Private method of "+this.getClass().getName());
	}
	protected void protectedMethod()
	{
		System.out.println("Protected method of "+this.getClass().getName());
	}
	public void publicMethod()
	{
		System.out.println("Public method of "+this.getClass().getName());
	}
	public void publicMethod(FirstClass i)
	{
		System.out.println("Public method of "+this.getClass().getName()+(i.protStr+1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass fc= new SubClass();
		fc.protStr="new";
		fc.defaultMethod();
		fc.protectedMethod();
		fc.publicMethod(fc);
		//fc.privateMethod();
	}

}
