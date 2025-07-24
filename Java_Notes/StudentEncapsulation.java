public class StudentEncapsulation{
	public static void main(String []args){
		Student student=new Student();
		student.setRollNo(1000);
		student.setName("Akash");
		System.out.println("\nRoll Number\tName");
		System.out.println(student.getRollNo()+"\t"+student.getName());
	}
}
class Student{
	private int roll_no;
	private String name;
	
	void setRollNo(int roll_no){
		this.roll_no=roll_no;
	}
	
	/*
	void setRollNo(int rollno){
		roll_no=rollno;
	}
	*/
	
	int getRollNo(){
		return roll_no;
	}
	
	void setName(String sname){
		name=sname;
	}
	
	String getName(){
		return name;
	}
}