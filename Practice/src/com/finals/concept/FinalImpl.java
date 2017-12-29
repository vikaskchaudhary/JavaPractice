package com.finals.concept;

public class FinalImpl {

	public static void main(String[] args) {
		/*FinalClass fc= new FinalClass(5,"And");
		System.out.println(fc.getIntVar());
		fc= new FinalClass(6,"And");*/
		
		FinalClassA fa=new FinalClassA();
		System.out.println(fa.a);
		fa.a=10;
		System.out.println(fa.a);
		FinalClassA fa2=new FinalClassA();
		fa=fa2;
		fa=new FinalClassA();
		System.out.println(fa.a);
	}

}
