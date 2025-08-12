
class cakeCount{
    int count = 0;
    public synchronized void countCake(){
        count ++;
    }
}


class team implements Runnable{
    cakeCount count; //object create

    team(cakeCount counter){
        this.count = counter;
    }
    public void run(){
        for(int i = 1; i <=10;i++){
            count.countCake();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        cakeCount counter = new cakeCount();

        team t1 = new team(counter);
        Thread team1 = new Thread(t1);

        team t2 = new team(counter);
        Thread team2 = new Thread(t2);
        team1.start();
        team2.start();
        try{
            team1.join();
            team2.join();
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println(counter.count);
    }
}
