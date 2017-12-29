package inheritance.pack1;

public class FirstClass {
	
	String defaultStr="DefaultStr";
	public String pubStr="PubStr";
	protected String protStr="ProtectedStr";
	private String privStr="PrivateStr";
	public StringBuffer sb= new StringBuffer("sb");
	
	
	public FirstClass(int a){
		//sb.
		pubStr= new String("X");
		pubStr.concat("x");
	}
	void defaultMethod()
	{
		System.out.println("Default method of "+this.getClass().getName());
	}
	/*private void privateMethod()
	{
		System.out.println("Private method of "+this.getClass().getName());
	}*/
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
		System.out.println("Public method of "+this.getClass().getName()+i.protStr);
	}

}
