package reflect.pkg;

public class Test
{
	// creating a private field
	private String s;
/*private static Test singletoneTest=new Test();

	public static Test getSingletoneTest() {
		if(singletoneTest==null)
			singletoneTest= new Test();
	return singletoneTest;
}*/

	// creating a public constructor
	public Test() {
		/*if(Test.singletoneTest != null) {
			throw new InstantiationError("Object creation through reflection not allowed");
		}*/
		s = "GeeksforGeeks"; }

	// Creating a public method with no arguments
	public void method1() {
		System.out.println("The string is " + s);
	}

	// Creating a public method with int as argument
	public void method2(int n) {
		System.out.println("The number is " + n);
	}

	// creating a private method
	private int method3() {
		System.out.println("Private method invoked");
		return 10;
	}
}