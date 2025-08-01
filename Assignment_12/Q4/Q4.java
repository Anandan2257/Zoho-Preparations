/*Create a Java program with a shared counter. Spawn 3 threads, where each thread increments 
the counter 1000 times. Use synchronization to avoid race conditions and display the final value */

class Counter{
    int count = 0;
    public synchronized void increments(){
        count++;
    }
}

class person1 implements Runnable{
    Counter count;

    person1(Counter count){
        this.count = count;
    }

    public void run(){
        for(int i = 1; i <= 1000;i++){
            count.increments();
        }
    }
}

class person2 implements Runnable{
    Counter count;

    person2(Counter count){
        this.count = count;
    }

    public void run(){
        for(int i = 1; i <= 1000;i++){
            count.increments();
        }
    }
}

class person3 implements Runnable{
    Counter count;

    person3(Counter count){
        this.count = count;
    }

    public void run(){
        for(int i = 1; i <= 1000;i++){
            count.increments();
        }
    }
}
public class Q4 {
    public static void main(String[] args) {
        Counter count = new Counter();
        person1 p1 = new person1(count);
        Thread person1 = new Thread(p1);

        person1 p2 = new person1(count);
        Thread person2 = new Thread(p2);

        person1 p3 = new person1(count);
        Thread person3 = new Thread(p3);

        person1.start();
        person2.start();
        person3.start();

        try{
            person1.join();
            person2.join();
            person3.join();
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println(count.count);
    }
}
