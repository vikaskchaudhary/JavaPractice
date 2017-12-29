import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListExample {
	
	public static void main(String[] args){
		Set<check> ls= new HashSet<check>();
		HashMap<String,String> hm= new HashMap<>();
		System.out.println(hm.put("key", "value"));
		check ch= new check();
		ch.data1="A";
		ch.data2="B";
		ls.add(ch);
		
		ch= new check();
		ch.data1="A";
		ch.data2="B";
		System.out.println(ls.contains(ch));
		ls.add(ch);

		ch= new check();
		ch.data1="B";
		ch.data2="C";
		System.out.println(ls.contains(ch));
		ls.add(ch);
		
		ArrayList<String> ls1=new ArrayList<String>();
		ls1.add("1");
		ls1.add("2");
		ls1.add("3");
		ls1.add("4");
		ls1.add("5");
		ls1.add("6");
		ls1.add("7");
		ls1.add("8");
		ls1.add("9");
		ls1.add("10");
		ls1.add("11");
		ls1.add("a");
		ls1.add("b");
		
		//System.out.println(ls1.stream().findAll().get());
		

	}

}
class check{
	String data1="";
	String data2="";
}