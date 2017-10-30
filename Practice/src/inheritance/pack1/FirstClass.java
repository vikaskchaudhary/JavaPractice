package inheritance.pack1;

public class FirstClass {
	
	String defaultStr="DefaultStr";
	public String pubStr="PubStr";
	protected String protStr="ProtectedStr";
	private String privStr="PrivateStr";
	
	
	void defaultMethod()
	{
		System.out.println("Default method of "+this.getClass().getName());
	}
	private void privateMethod()
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

}
