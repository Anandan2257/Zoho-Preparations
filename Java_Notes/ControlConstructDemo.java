public class ControlConstructDemo{
	public static void main(String[] agr){
		int i=1;
		label:
		while(i<=10){
			if(i%2!=0){
				i++;
				continue label;
			}
			System.out.print(i+" ");
			i++;			
		}
	}
}
/*
class Main {
    public static void main(String[] args) {
        int i=0;
        while(i<=10){
            i++;
            if(i%2==0){
                System.out.print(i+ " ");
            }else{
                continue;
            }
        }
    }
}
*/