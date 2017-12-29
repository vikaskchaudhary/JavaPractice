package method.reference.example;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Sayable{  
    void say(String s); 
    default void myMet(){
    	System.out.println("hi Default");
    }
    static void newMet(){
    	System.out.println("hi static");
    }
  
}  

interface Interesting<T , U, R>{
	
	 R check(T t, U u);
	 
	  default <V> Interesting<T, U, V> andThen(Function<? super R, ? extends V> after) {
	        Objects.requireNonNull(after);
	        return (T t, U u) -> after.apply(check(t, u));
	    }
}

class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
}
public final class MethodReference implements Interesting {
	
	public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  

	 public static void saySomething(String s){  
	        System.out.println("Hello, this is static method."+s);  
	    }  
	public static void main(String[] args) {
		
		/* Example 1
		// Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say("Hello");  
        
        
        Example 2
        Thread t2=new Thread(MethodReference::ThreadStatus);  
        t2.start();   
        
        
        BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;  
        int result = adder.apply(10, 20);  
        System.out.println(result); */
		
//		{
//		String s;
//		s= "abc";
//		String k;
//		k= new String("welcome");
//		char a[]={'a','b'};
//		String n= new String(a);
//		
//		System.out.println(s+" "+k+" "+n);
//		}
//		Sayable.newMet();
//		Sayable.myMet();
		
		//Interesting ir= MethodReference<>::check()->return 
	}

	@Override
	public Object check(Object t, Object u) {
		// TODO Auto-generated method stub
		return null;
	}

}
