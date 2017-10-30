package rnd.temp;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class CharIntTypCast {
	
	static ConcurrentHashMap<String,String> chm= new ConcurrentHashMap<String,String>();
	
	
	static Hashtable<String,String> ht = new Hashtable<String,String>();

	public static void main(String [] args){
		chm.put("a","1");
		chm.get("k");
		ht.put("a", "1");
		ht.get("k");
		
		int x=3*'A';
		char ch=65;
		System.out.println(x);
		switch(ch){
		case 'A':
			System.out.println("it is A");
			break;
		case 'B':
			System.out.println("B");
		case 195:
			System.out.println("195");
			break;
		}
	}
}
