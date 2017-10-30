import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

public class FindOS {
	
	
	/*public int checkSumDouble(int a,int b)
	{
		return a==b?2*(a+b):a+b;
	}*/
	static{
		System.out.println("Initializer block");;
	}

//	 static Logger logger= Logger.getLogger(FindOS.class);
//	 static Logger logger1= Logger.getLogger("com.test.info");
//	 static Logger logger2= Logger.getLogger("com.test.debug");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FindOS fos = new FindOS();
		
		
		/*HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Vikas", "949494949");
		hm.put("Vikas", "949494941");
		hm.put("Vikas", "949494942");
		hm.put("Vikas", "949494943");
		hm.put("Vikas", "949494944");
		
		Iterator<Entry<String, String>> it= hm.entrySet().iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println(System.getProperty("os.name"));
		*/
		
		
		
		try{
			FileInputStream fr= new FileInputStream("xyz.txt");
			fr.hashCode();
			System.out.println("try Block executed");
			
		}catch(Exception e)
		{
			System.out.println("Catch Block executed");
			System.exit(10000000);
		}finally{
			System.out.println("Finally Block executed");
		}
//		logger2.warn(System.getProperty("os.name"));
//		logger1.info(System.getProperty("os.name"));
//		logger1.error("Error Occured check");
//		logger2.debug("Debug check");

	}

}
