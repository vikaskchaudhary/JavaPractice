package reflect.pkg;
public class SubClass /*extends BaseClass*/ {

	
	 static void main(String[] args){
		BaseClass bc= new BaseClass();
		System.out.println(bc.checkDefault());
		System.out.println(bc.checkProtected());
		System.out.println(bc.checkPublic());
	}
}
