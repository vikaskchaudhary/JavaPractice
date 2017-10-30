import java.util.HashSet;
import java.util.Vector;

public class VectorExample implements Cloneable{
	int x;
	int y=6;
	String s="ram";
	String s2=new String("ram");
	public static void main(String[] args) throws CloneNotSupportedException{
		Vector vec= new Vector();
		vec.add("Apple");
		vec.add("Apple1");
		vec.add("Apple");
		vec.add("Apple1");
		vec.add("Apple2");
		System.out.println(myFunc(vec));
		VectorExample vObj=new VectorExample();
		VectorExample vObj1=new VectorExample();
		try {
			vObj1=(VectorExample) vObj.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vObj1.x=7;
		VectorExample vObj2= (VectorExample) vObj.clone();//new VectorExample();
		//vObj2=(VectorExample) vObj.clone();
		vObj2.x=7;
		System.out.println(vObj.x);
		System.out.println("Obj and Obj1 =="+" "+ (vObj.equals(vObj1)));
		System.out.println("Obj1 and Obj2 =="+" "+(vObj==vObj1));
		System.out.println("Obj and Obj1 =="+" "+ (vObj==vObj2));
	}
	
	public static Vector myFunc(Vector v){
		return new Vector(new HashSet(v));
	}

}
