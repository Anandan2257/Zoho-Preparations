interface RBI{
	//public static final 
	float RATEOFINTEREST=6.8f;

	default float get(){
		return RATEOFINTEREST;
	}

	abstract void showInterest();
}


class SBI implements RBI{
	private float rateOfInterest=7.8f;

	/*float get(){
		return rateOfInterest;
	}*/

	public void showInterest(){
		System.out.println("SBI "+get());
	}
}

class HDFC implements RBI{
	private float rateOfInterest=9.8f;

	public float get(){
		return rateOfInterest;
	}

	public void showInterest(){
		System.out.println("HDFC "+get());
	}
}

public class Interface{
	public static void main(String args[]){
		RBI rbi=new SBI(); //upcasting
		rbi.showInterest();
		rbi=new HDFC();
		rbi.showInterest();	
	}
}