package generic.example;

public class GenericExample<T, Z> {
	
	T myData;
	T myData2;
	Z otherData;
	GenericExample(T a, Z b)
	{
		myData=a;
		otherData=b;
	}
	
	T getData()
	{
		
		
		return myData;
	}
	Z getData1()
	{
		
		
		return otherData;
	}

}
