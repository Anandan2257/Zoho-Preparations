public class Generics{
	public static void main(String[] args){
		Integer x=10,y=20;
		ArithmeticOp.add(x,y);
		Double m=23.2,n=90.78;
		ArithmeticOp.add(m,n);
		//String string1="Hello", string2="Generics";
		//ArithmeticOp.add(string1,string2);	
	}
}

class ArithmeticOp{
	static <T extends Number> void add(T value1,T value2){
		double summation=value1.doubleValue()+value2.doubleValue();
		System.out.println(summation);
	}
}