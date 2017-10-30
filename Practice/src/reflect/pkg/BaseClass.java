package reflect.pkg;

public class BaseClass {
	
	int d=3;
	private int p=1;
	protected int pr=2;
	public int pu=4;
	
	int checkDefault()
	{
		return d;
	}
	private int checkPrivate()
	{
		return p;
	}
	protected int checkProtected()
	{
		return pr;
	}
	public int checkPublic()
	{
		return pu;
	}

}
