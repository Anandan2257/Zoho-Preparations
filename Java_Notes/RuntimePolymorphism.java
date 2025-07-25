class RBI{
	private float rateOfInterest=6.8f;

	protected float get(){
		return rateOfInterest;
	}

	protected void showInterest(){
		System.out.println("RBI "+get());
	}
}


class SBI extends RBI{
	private float rateOfInterest=7.8f;

	public float get(){
		return rateOfInterest;
	}

	public void showInterest(){
		System.out.println("SBI "+get());
	}
}

class HDFC extends RBI{
	private float rateOfInterest=9.8f;

	public float get(){
		return rateOfInterest;
	}

	public void showInterest(){
		System.out.println("HDFC "+get());
	}
}

public class RuntimePolymorphism{
	public static void main(String args[]){
		RBI rbi;//=new RBI();
		//rbi.showInterest();
		rbi=new SBI(); //upcasting
		rbi.showInterest();
/*		rbi=new HDFC();
		rbi.showInterest();
		rbi=new RBI();	*/	
		SBI sbi=(SBI)rbi; //downcasting
		sbi.showInterest();
	}
}