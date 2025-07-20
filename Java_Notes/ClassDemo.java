import java.util.Scanner;
public class ClassDemo{
	int roll_no;
	String name;
	String department;
	String course;
	static String collegeName;
	double mark1;
	double mark2;
	double total;
	double percentage;    //instance variables - attributes 


	/*ClassDemo(){
	}//Default Constructor created by compiler*/
	
	ClassDemo(){
		roll_no=0;
		name=null;
		department=null;
		course=null;
		mark1=0;
		mark2=0;
		total=0.0;
		percentage=0.0;
	} 
	
	ClassDemo(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
		department=null;
		course=null;
		mark1=0;
		mark2=0;
		total=0.0;
		percentage=0.0;
	}
	
	ClassDemo(ClassDemo obj){
		ClassDemo xObj=obj;
		xObj.showDetails();
	}
	
	void readDetails(){  //instance methods
		System.out.print("\nRead the following details of a Student\n");
		Scanner read=new Scanner(System.in);
		roll_no=read.nextInt();
		name=read.next();
		department=read.next();
		course=read.next();
		mark1=read.nextDouble();
		mark2=read.nextDouble();
		read.close();
	}

	void calculatePercentage(){
		total=mark1+mark2;
		percentage=(double)(total/2);
	}
	
	void showDetails(){
		System.out.print("\nDetails of the Student\n");
		System.out.println(roll_no+"\t"+name+"\t"+department+"\t"+course+"\t"+collegeName+"\t"+total+"\t"+percentage);
	}
	
	public static void main(String []args){
		ClassDemo cd=new ClassDemo();
		//ClassDemo cd1=new ClassDemo(200,"MMM");
		ClassDemo.collegeName="XXX College";
		cd.readDetails();
		cd.calculatePercentage();
		System.out.println("\nRoll_no\tName\tDepartment\tCourse\tCollege\tTotal\nPercentage");
		cd.showDetails();
		//cd1.showDetails();
		ClassDemo cd2=new ClassDemo(cd);
		cd2.showDetails();
	}
}