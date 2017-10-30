package com.collections.exqample;

import java.util.Collections;
import java.util.HashMap;
import java.util.function.BiFunction;

public class HashMapLearn {
	
	static HashMap<String,String> hm1= new HashMap();
	static HashMap<String,String> hm2= new HashMap();
	
	
	

	public static void main(String[] args) {
		hm1.put("A","B1");
		hm1.put("B","B2");
		hm1.put("C","B3");
		hm2.put("A","B4");
		hm2.put("D","B5");
		hm2.put("E","B6");
		
//		BiFunction<? super String, ? super String, ? extends String> remappingFunction;
//		hm1.merge(key, value, remappingFunction);
		
		hm1.putAll(hm2);
		System.out.println(hm1);
	}
}
