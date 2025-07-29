class AgeCheckException extends Exception{
	AgeCheckException(){}
	AgeCheckException(String message){
		super(message);
	}
	
	void checkAge(int age) throws Exception{
		if(age<18){
			throw new AgeCheckException("Below 18: Not-Eligible");
		}
	}
	
}

public class CustomException{
	public static void main(String[] args) throws Exception{
		AgeCheckException ace=new AgeCheckException();
		int age=17;
		try{
			ace.checkAge(age);
		}catch(AgeCheckException e){
			System.out.println("In Catch: "+e.getMessage());
		}
		/*if(check){
			System.out.println("Eligible");
		}else{
			System.out.println("Not-Eligible");
		}*/
	}
}
