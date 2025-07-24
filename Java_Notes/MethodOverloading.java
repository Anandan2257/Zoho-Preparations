import java.util.Scanner;
public class MethodOverloading{
	public static void main(String []args){
		int x=10,y=20;
		//String y="20";
		Operations op=new Operations();
		Scanner read=new Scanner(System.in);
		System.out.println("Read two integer values: ");
		x=read.nextInt();
		y=read.nextInt();
		System.out.println("Integer : "+op.add(x,y));
		//System.out.println("Double : "+op.add(23.2,32.3));
		//System.out.println("String : "+op.add("Hello","ZSGS-Folks"));
		read.close();
	}
}

class Operations{
	int add(int number1,String str){
		return number1;
	}
/*	double add(double number1,double number2){
		return number1+number2;
	}
	String add(String string1,String string2){
		return string1+string2;
	}*/
}