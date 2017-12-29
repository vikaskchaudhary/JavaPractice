package inheritance.pack2;

import inheritance.pack1.FirstClass;

public class SubClass extends FirstClass {

	
	/*public void anotherMethod(){
		FirstClass fc= new FirstClass();
		//fc.defaultMethod();
		fc.protectedMethod();
		fc.publicMethod();
	}*/
	
	SubClass(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	/*
	public int myMet(){
		while(true){
			
		}
	}*/
	
	private String getMissingLetters(String content, String userContent) {
		String missingLetters="";
		int userContentIndex=0;		
		/*//if(content.length()>userContent.length()){
			for (int i=0;i<content.length();i++) {
				if(userContentIndex==userContent.length()){
					missingLetters+=content.substring(i, content.length());
					break;
				}
				if(content.charAt(i)!=userContent.charAt(userContentIndex)){
					missingLetters+=content.charAt(i);
				}else if(content.charAt(i)==userContent.charAt(userContentIndex)){
					userContentIndex++;
				}
			}
		//}
*/		
		if(userContent.length()==0) {
			return content;
		}else {
			for(int i=0;i<content.length();i++) {
				String letters=String.valueOf(content.charAt(i));
				if(!userContent.contains(letters)&& !missingLetters.contains(letters)) {
					missingLetters+=letters;
				}
			}
		}
		
		return missingLetters.isEmpty() ?null :missingLetters;
	}
	
	private String getLetterOrders(String content, String userContent) {
		String letterUnordered="";
		for (int i=0;i<userContent.length();i++) {		
			if(content.contains(String.valueOf(userContent.charAt(i)))){
				if(content.charAt(i)!=userContent.charAt(i)){
					letterUnordered+=userContent.charAt(i);
				}
			}
		}
		return letterUnordered.isEmpty() ?null :letterUnordered;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass fc= new SubClass(1);
		//fc.defaultMethod();
//		fc.protectedMethod();
//		fc.publicMethod();
		System.out.println(fc.getMissingLetters("Banana", "ba"));
	}

}
