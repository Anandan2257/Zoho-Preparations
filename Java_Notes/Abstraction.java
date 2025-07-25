abstract class RBI{
	private float rateOfInterest=6.8f;

	float get(){
		return rateOfInterest;
	}

	abstract void showInterest();
}


class SBI extends RBI{
	private float rateOfInterest=7.8f;

	float get(){
		return rateOfInterest;
	}

	void showInterest(){
		System.out.println("SBI "+get());
	}
}

class HDFC extends RBI{
	private float rateOfInterest=9.8f;

	float get(){
		return rateOfInterest;
	}

	void showInterest(){
		System.out.println("HDFC "+get());
	}
}

public class Abstraction{
	public static void main(String args[]){
		RBI rbi=new SBI(); //upcasting
		rbi.showInterest();
		rbi=new HDFC();
		rbi.showInterest();	
	}
}