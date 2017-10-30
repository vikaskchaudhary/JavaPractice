// A simple Java program to demonstrate the use of reflection
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import reflect.pkg.*;

// class whose object is to be created


class Demo
{
	public static void main(String args[]) throws Exception
	{
		// Creating object whose property is to be checked
		//Test obj = Test.getSingletoneTest();
		//Test obj = new Test();
		//Class cls1= Class.forName("reflect.pkg.Test");
		//Object obj=cls1.newInstance();

		// Creating class object from the object using
		// getclass method
		Class<?> cls = Class.forName("reflect.pkg.Test");
		Object obj=cls.newInstance();
		System.out.println("The name of class is " +
							cls.getName());

		// Getting the constructor of the class through the
		// object of the class
		Constructor<?> constructor = cls.getConstructor();
		System.out.println("The name of constructor is " +
							constructor.getName());

		//Object obj=constructor.newInstance();

		// Getting methods of the class through the object
		// of the class by using getMethods
		Method[] methods = cls.getMethods();
		Method[] methods1 = cls.getDeclaredMethods();
		System.out.println("The declared methods of class are : ");
		// Printing method names
				for (Method method:methods1)
					System.out.println(method.getName());
		System.out.println("The public methods of class are : ");
		// Printing method names
		for (Method method:methods)
			System.out.println(method.getName());

		// creates object of desired method by providing the
		// method name and parameter class as arguments to
		// the getDeclaredMethod
		Method methodcall1 = cls.getDeclaredMethod("method2",int.class);

		// invokes the method at runtime
		methodcall1.invoke(obj, 19);

		// creates object of the desired field by providing
		// the name of field as argument to the 
		// getDeclaredField method
		Field field = cls.getDeclaredField("s");

		// allows the object to access the field irrespective
		// of the access specifier used with the field
		field.setAccessible(true);

		// takes object and the new value to be assigned
		// to the field as arguments
		field.set(obj, "JAVA");

		// Creates object of desired method by providing the
		// method name as argument to the getDeclaredMethod
		Method methodcall2 = cls.getDeclaredMethod("method1");

		// invokes the method at runtime
		methodcall2.invoke(obj);

		// Creates object of the desired method by providing
		// the name of method as argument to the 
		// getDeclaredMethod method
		Method methodcall3 = cls.getDeclaredMethod("method3");

		// allows the object to access the method irrespective 
		// of the access specifier used with the method
		methodcall3.setAccessible(true);

		// invokes the method at runtime
		int x= (int) methodcall3.invoke(obj);
		System.out.println(x);
	}
}
