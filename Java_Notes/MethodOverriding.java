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

	float get(){
		return rateOfInterest;
	}

	public void showInterest(){
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

public class MethodOverriding{
	public static void main(String args[]){
		RBI rbi=new RBI();
		rbi.showInterest();
		
		SBI sbi=new SBI();
		sbi.showInterest();

		HDFC hdfc=new HDFC();
		hdfc.showInterest();
	}
}