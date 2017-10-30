
public class UtilityString {

	
	public static void countChar(String str){
		char[] charArray=str.toCharArray();
		int alphCount=0,digitCount=0,spcount=0;
		for(char ch:charArray){
			int ascii=ch;
			if((ascii>=65 && ascii<=97) || (ascii>=98 && ascii<=122)){
				alphCount++;
			}
			else if(ascii>=48 && ascii<=57){
				digitCount++;
			}
			else{
				spcount++;
			}
		}
		System.out.println("Alphabtes "+alphCount);
		System.out.println("Digits "+digitCount);
		System.out.println("Special character "+spcount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countChar("V!kas123 ");
	}

}
