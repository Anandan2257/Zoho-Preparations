public class MultipleInheritanceDemo extends A, B{
	public static void main(String ...a){
		MultipleInheritanceDemo cObject=new MultipleInheritanceDemo();
		cObject.x=10;  //ambiguity statement 
		cObject.readX();
	}
}
class A{
	int x;
	void readX(){}
	void showX(){}	
}

class B{
	int x;
	void readX(){}
	void showX(){}	
}