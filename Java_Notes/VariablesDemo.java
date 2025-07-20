public class VariablesDemo
{
	static int count;
	int id;
	VariablesDemo(){

	}
	public static void main(String[] args){
		VariablesDemo vd=new VariablesDemo();
		int localVariable=10;
		System.out.println(localVariable+" ");
		System.out.println(count+" ");
		System.out.println(vd.id);


		{
			int blockVariable=100;
			System.out.println(blockVariable);
		}
		//System.out.println("Outside the block: "+blockVariable);
		System.out.println(0b10);
		System.out.println(065);
		System.out.println(0x16);
		System.out.println('f');
		System.out.println("Welcome");

		System.out.println(vd instanceof VariablesDemo);
	}
}


/*
byte - 1-byte 8-bit 2^8-1

Range: -2^(n-1) to (2^n-1)-1 n-no. of bits */
