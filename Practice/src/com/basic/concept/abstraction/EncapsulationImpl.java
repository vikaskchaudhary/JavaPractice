package com.basic.concept.abstraction;

public class EncapsulationImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation enObj=new Encapsulation();
		System.out.println("After non-parameterized Constructor Initialization:- ");
		System.out.println("getOnlyStr "+enObj.getGetOnlyStr());
		System.out.println("In "+enObj.getIn());
		System.out.println("getStr "+enObj.getStr());
		enObj.setGetOnlyStr("getOnlyStr");
		enObj.setIn(1);
		enObj.setStr("str");
		System.out.println("\nAfter Setter:- ");
		System.out.println("getOnlyStr "+enObj.getGetOnlyStr());
		System.out.println("In "+enObj.getIn());
		System.out.println("getStr "+enObj.getStr());
		
		
		
		 enObj=new Encapsulation("\nConstructorparam",2,"param");
		System.out.println("After parameterized Constructor Initialization:- ");
		System.out.println("getOnlyStr "+enObj.getGetOnlyStr());
		System.out.println("In "+enObj.getIn());
		System.out.println("getStr "+enObj.getStr());
		enObj.setGetOnlyStr("getOnlyStr1");
		enObj.setIn(11);
		enObj.setStr("str1");
		System.out.println("\nAfter Setter:- ");
		System.out.println("getOnlyStr "+enObj.getGetOnlyStr());
		System.out.println("In "+enObj.getIn());
		System.out.println("getStr "+enObj.getStr());
	}

}
