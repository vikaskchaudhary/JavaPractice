

import reflect.pkg.BaseClass;

 class SubClassDifPkg extends BaseClass{
	 @Override
	protected int checkProtected()
	 {
		 return 3;
	 }
	
	public static void main(String[] args){
		BaseClass bc= new SubClassDifPkg();
		//System.out.println(bc.checkDefault());
		//System.out.println(bc.checkProtected());
		System.out.println(bc.checkPublic());
	}

}
