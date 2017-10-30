import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class TemplateForRnD {
	private final int value;
	public String myVar="String";
	TemplateForRnD(){
		this.value=2;
	}
	interface lambdaDemo{
		public int functionalInt(int a, int b);
		public default void ex(){};
	}
	/*private static boolean hasDistinctDigits(int number) {
	     int numMask = 0;
	     int numDigits = (int) Math.ceil(Math.log10(number+1));
	     
	     					System.out.println("number "+number+"\t numDigits "+Math.log10(number+1));
	     for (int digitIdx = 0; digitIdx < numDigits; digitIdx++) {
	    	 
	         int curDigit = (int)(number / Math.pow(10,digitIdx)) % 10;
	         
	         				System.out.print("\t curDigit "+curDigit);
	         
	         int digitMask = (int)Math.pow(2, curDigit);
				         
					         System.out.print("\tdigitMask "+digitMask);
					         System.out.print("\t numMask "+numMask);
					         System.out.println("\t numMask & digitMask "+(numMask & digitMask));
	         
	         if ((numMask & digitMask) > 0) return false;
	         numMask = numMask | digitMask;
	     }
	     return true;
	 }*/
	
	public void  sum(int a,int b)
	{
		
		
	}

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
	    ArrayList<String> a2 = new ArrayList<String>();
	    HashMap<String,String> hm= new HashMap<String,String>();
	    hm.put("A", "B");

	    a1.add("ac");
	    a1.add("b");
	    a2.add("b ");
	    a2.add("c");
	    a1.add("c");
for(String x:a2)
	    System.out.println(x+" " +a2.contains("b ".trim()));


		String str="Vikas";
		str.hashCode();
		str +="fkf";
		
		
		// TODO Auto-generated method stub
		//for(int i=100; i<=110;i++)
		
		//System.out.println("\t"+hasDistinctDigits(1));
		
	/*	String str="";
		str="Hi"+"\n"+"bye";
		System.out.println(str);*/
		//String str1="Complied Y/N";

		/*lambdaDemo ld= (int a, int b)->(a+b); 
		lambdaDemo ld1= (int a, int b)->(a*b); 
		lambdaDemo ld2= (int a, int b)->(a-b); 
		
		System.out.println(ld.functionalInt(5, 4));
		System.out.println(ld1.functionalInt(5, 4));
		System.out.println(ld2.functionalInt(5, 4));*/
		/*String uName=null;
		
		String sql = "select \"headbusiness\",\"ceo\",\"headvertical\",\"headcircleid\",\"headclusterid\",\"userid\",\"username\",\"lname\",\"fname\",\"emailId\",\"desg\",role.\"roleid\",role.\"role\" from \"DHFLSchema\".\"users\" usr Left JOIN \"DHFLSchema\".\"userroles\" role ON usr.\"roleid\" = role.\"roleid\" where lcase(usr.\"username\")=lcase('"
				+ uName + "')";
		
		System.out.println(sql);*/
		
		
		
		Stack<?> st= new Stack<>();
		Queue<?> q=new LinkedList<>();
		q.poll();
		st.add(null);
		
		TemplateForRnD tobj= new TemplateForRnD();
		tobj.myVar="var1";
		tobj.myVar.hashCode();
		TemplateForRnD tobj1= new TemplateForRnD();
		tobj1.myVar="var2";
		tobj1.myVar="var1";
		String s="abc";
		String k=new String("abc");
		tobj.equals(tobj1);
		System.out.println(s==k);
		Set s1= new HashSet();
		s1.add("Set");
		
		StringBuffer sb= new StringBuffer();
	}

}
