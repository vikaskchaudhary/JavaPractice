package date.example;

public class SubClass extends ParentClass{

	public void childMet(int a, int b){
		System.out.println("Child method " +(a+b));
	}
	
	public static void main(String args[]){
		SubClass s1 = new SubClass();
		s1.compulsoryMethod(5,6);
	}

}
