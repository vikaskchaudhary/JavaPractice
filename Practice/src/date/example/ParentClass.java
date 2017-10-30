package date.example;

public class ParentClass implements ChilMethodCaller{
	ParentClass(){
		System.out.println("Parent Constructor");
	}
	
	public void compulsoryMethod(int a, int b){
		System.out.println("Parent Compulsory method");
		this.childMet(a,b);
	}


	@Override
	public void childMet(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Parent child Met"+(a*b));
	}
}
