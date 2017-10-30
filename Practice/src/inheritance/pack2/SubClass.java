package inheritance.pack2;

import inheritance.pack1.FirstClass;

public class SubClass extends FirstClass {

	
	/*public void anotherMethod(){
		FirstClass fc= new FirstClass();
		//fc.defaultMethod();
		fc.protectedMethod();
		fc.publicMethod();
	}*/
	
	/*
	public int myMet(){
		while(true){
			
		}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass fc= new SubClass();
		//fc.defaultMethod();
		fc.protectedMethod();
		fc.publicMethod();
	}

}
