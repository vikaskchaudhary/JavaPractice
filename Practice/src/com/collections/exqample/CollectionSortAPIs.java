package com.collections.exqample;

import java.util.*;
import java.util.Map.Entry;
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
		Map m= new LinkedHashMap<>();
		Vector<String> vs;
		ConcurrentHashMap<String,String> chs;
		Hashtable<String,String> Ht;
		HashSet<String> st;
		String key = null;
		String value = null;
		
		hs.put("1","ABCD");
		
		Iterator it=hs.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry pair= (Map.Entry) it.next();
			System.out.println(pair.getKey()+" "+pair.getValue());
		}
		hs.merge("1","EFGhij",(a,b)->a.substring(2).concat(b.substring(3)));
		System.out.println(hs);
		
		ls.add("Vikas");
		ls.add("Basant");
		ls.add("Shishir");
		String lsd="a";
		
		lsd.hashCode();
		Object obj;
		
		System.out.println("Before sort ");
		print(ls);
		Collections.sort(ls);
//		Collections.
		System.out.println("\nafter sort ");
		print(ls);
		//Comparator c = ;
		Collections.sort(ls, Collections.reverseOrder());
		
		System.out.println("\nafter sort ");
		print(ls);
	}

}
