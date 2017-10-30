package com.collections.exqample;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.BiFunction;


public class CollectionSortAPIs {

	
	public static void print(List<String> ls){
		for(String s:ls){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls= new ArrayList<String>();
		HashMap<String,String> hs = new HashMap<>();
		Vector<String> vs;
		ConcurrentHashMap<String,String> chs;
		Hashtable<String,String> Ht;
		HashSet<String> st;
		String key = null;
		String value = null;
		
		hs.put("1","ABCD");
		hs.merge("1","EFGhij",(v1,v2)->v1.substring(2).concat(v2.substring(3)));
		System.out.println(hs);
		
		ls.add("Vikas");
		ls.add("Basant");
		ls.add("Shishir");
		String lsd="a";
		lsd.hashCode();
		
		System.out.println("Before sort ");
		print(ls);
		Collections.sort(ls);
		System.out.println("\nafter sort ");
		print(ls);
		//Comparator c = ;
		Collections.sort(ls, Collections.reverseOrder());
		
		System.out.println("\nafter sort ");
		print(ls);
	}

}
