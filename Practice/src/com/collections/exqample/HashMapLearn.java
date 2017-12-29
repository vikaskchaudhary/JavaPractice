package com.collections.exqample;

import java.lang.reflect.Constructor;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapLearn {
	
	static HashMap<String,String> hm1= new HashMap();
	static HashMap<String,String> hm2= new HashMap();
	boolean b;
	HashMapLearn(){
		System.out.println(b);
	}
	
	List<String> ls= new CopyOnWriteArrayList<String>();
	
	static ConcurrentHashMap hml= new ConcurrentHashMap();
	public static void main(String[] args) {
		HashMapLearn hl = new HashMapLearn();
		hm1.put("A","B1");
		hm1.put("A","B2");
		hm1.put("B","B2");
		hm1.put("C","B3");
		hm2.put("A","B4");
		hm1.put("D","B5");
		hm1.put("E","B6");
		Class cls;
		Constructor cs;
		System.out.println(new Date());
		hm1.keySet().stream().filter(k->k!="D").forEach(k->System.out.print(k));
		System.out.println(new Date());
		
		System.out.println(new Date());
		//Iterator<KeySet> it=hm1.keySet().iterator();
//		while(it.hasNext()){
//			if(!it.next().equals("D")){
//				System.out.println(it.next());
//			}
//		}
		System.out.println(new Date());
		
		//System.out.println(hm1);
		
//		BiFunction<Object, String, String> remappingFunction=new BiFunction<Object, String, String>() {
//			
//			@Override
//			public String apply(Object t, String u) {
//				// TODO Auto-generated method stub
//				return t.toString()+u;
//			}
//		};
//		hm1.merge("C", "3", remappingFunction);
//		
//		//hm1.putAll(hm2);
//		System.out.println(((int)Math.pow(2, 30)));
//		System.out.println(1<<30);
//		synchronized(hm1){
		//new HashMapLearn().print(null);
//			
//		}
		
		/*short a=0;
		int b=01;
		int c=02;
		int d=03;
		a+=d;
		System.out.println(""+b+c+a);*/
	}
	
//	public void print(Object o){
//		System.out.println(o+" Object");
//	}
//	public void print(String s){
//		System.out.println(s+" String");
//	}
	
}
