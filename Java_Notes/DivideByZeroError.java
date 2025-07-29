public class DivideByZeroError{
	int x,y;
	public static void main(String[] args){
		DivideByZeroError dObj=new DivideByZeroError();
		dObj.x=100; dObj.y=10;
		dObj.method1(dObj.x,dObj.y);
		//System.out.println("Result: "+result);
	}
	
	void method1(int x, int y){
		DivideByZeroError dObj=new DivideByZeroError();
		int result=0;
		try{
		result=dObj.division(x,y);
		}finally{
			System.out.println("always finally gets executed...");
		}
		System.out.println("Result: "+result);
	}
	
	int division(int x, int y){
		return x/y;
	}
}

/*
	static void method1(){
		int arr[]={0,1,2,3,4,5};
		System.out.println("Size: "+arr.length);
		try{
			int result=(arr[10]/0);
			System.out.println("Formula:"+result);
			System.out.println("Divide by Zero if x==y...");
		}catch(ArithmeticException e){
			System.out.println("Arithmetic");
			System.out.print(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("IndexOutOfBoundsException");		
			System.out.print(e.getMessage());
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("Exception");
			System.out.print(e.getMessage());
		}
*/