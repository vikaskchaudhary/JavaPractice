import java.util.Comparator;

public class CompareObjects implements Comparator<KeyVal> {
	
	
	
	
	public static void main(String ... args){
		CompareObjects obj=new CompareObjects();
		KeyVal kv1=new KeyVal();
		KeyVal kv2=new KeyVal();
		kv1.keyValue="hi";
		kv1.valValue="data";
		
		kv2.keyValue="hi";
		kv2.valValue="data";
		
		System.out.println(obj.compare(kv1,kv2));
		
	}

	@Override
	public  int compare(KeyVal o1, KeyVal o2) {
		// TODO Auto-generated method stub
		if(o1.keyValue.equals(o2.keyValue) && o1.valValue.equals(o2.valValue))
			return 1;
		return 0;
	}

}
class KeyVal
	{
		String keyValue="";
		String valValue="";
		
	}