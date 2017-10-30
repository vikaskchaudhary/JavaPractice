package com.basic.concept.abstraction;

public class Encapsulation {
	/*
	 * Encapsulation is putting several things together
	 * and hiding the data details
	 * 
	 * Data hiding in Class is achieved by making it private */
	private String str=null;
	private int in;
	private String getOnlyStr;
	
	public Encapsulation(){
		//Constructor from a constructor of same class can only be called using "this()" 
		this(null,0,null);
		
	}
	
	public Encapsulation(String str,int in,String getOnlyStr){
		this.str=str;
		this.in=in;
		this.getOnlyStr=getOnlyStr;
		
	}
	
	/*
	 * Provide getter & setter method as per requirement */
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getIn() {
		return in;
	}
	public void setIn(int in) {
		this.in = in;
	}
	
	/*Making setter available for only for class of same package  only*/
	 String getGetOnlyStr() {
		return getOnlyStr;
	}
	public void setGetOnlyStr(String getOnlyStr) {
		this.getOnlyStr = getOnlyStr;
	}
	
	
	
	
	
	
}
