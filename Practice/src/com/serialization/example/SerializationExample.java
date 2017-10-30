package com.serialization.example;
import java.io.Serializable;

public class SerializationExample implements Serializable {
	
	private int a;
	
	private transient String b;
	
	volatile static String k;
	
	SerializationExample(){
		super();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
	

}
