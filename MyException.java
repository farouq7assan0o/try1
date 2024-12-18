package coding;

public class MyException {
	
	static void func1() throws FarouqException { 

	throw new FarouqException(); 
	
	

}

static void func2()throws FarouqException { 
	func1(); 
}

public static void main (String[] args ) {
	try { 
		
		
	func2(); 
	
	} catch(FarouqException e){
		
		System.out.println("func 2");

		
	}
}
}

