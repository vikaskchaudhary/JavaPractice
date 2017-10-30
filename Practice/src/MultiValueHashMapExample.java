

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;  
import java.util.Map;
import java.util.Set;
//import org.apache.commons.collections.map.MultiValueMap;

public class MultiValueHashMapExample {

    public static void main(String[] args) {
    	
    	HashMap<DataType,String> hm= new HashMap<DataType,String>();
    	 DataType d1= new DataType();
         d1.data1="1";
         d1.data2="2";
         hm.put(d1, "Obj1");
         DataType d2= new DataType();
         d2.data1="1";
         d2.data2="2";
         System.out.println(hm.get(d2));

        /*List<DataType> list1= new ArrayList<DataType>();
        List<DataType> list2= new ArrayList<DataType>();
        DataType d1= new DataType();
        d1.data1="1";
        d1.data2="2";
        list1.add(d1);
        
        d1= new DataType();
        d1.data1="11";
        d1.data2="22";
        list1.add(d1);
        
        DataType d2= new DataType();
        d2.data1="1";
        d2.data2="2";
        list2.add(d2);
        
        d2= new DataType();
        d2.data1="111";
        d2.data2="222";
        list2.add(d2);
        
        System.out.println("data from List  "+list1.get(0).data1+" and "+list2.get(0).data1 +" is Equal "+list1.get(0).data1.equals(list2.get(0).data1));
        System.out.println("data from List  "+list1.get(1).data1+" and "+list2.get(1).data1 +" is Equal "+list1.get(1).equals(list2.get(1)));*/
       /* HashMap<String,Integer> map = new  HashMap<String,Integer>();
        map.put("A", 4);
        map.put("A", 6);
        map.put("B", 7);
        map.put("C", 1);
        map.put("B", 9);
        map.put("A", 5);

        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        System.out.println("  Object key  Object value");
        while (it.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) it.next();
           // list = (List) map.get(mapEntry.getKey());
            for (int j = 0; j < list.size(); j++) {
                System.out.println("\t" + mapEntry.getKey() + "\t  " + list.get(j));
            }
        }*/
    }
}
class DataType{
	String data1="";
	String data2="";
}