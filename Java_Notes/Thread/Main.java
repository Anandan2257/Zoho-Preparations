

class A extends Thread{
    public void run(){
        for(int i = 0 ; i < 10;i++){
             System.out.println("Thread 1:" + i);
             try{
             Thread.sleep(10);
             }catch(InterruptedException e){
                System.out.println(e); // when using sleep at a time to try catch block
             }
        }
       
    }
}


class B extends Thread{
    public void run(){ // run override from thread
        for(int i = 0 ; i < 10;i++){
             System.out.println("Thread 2:" + i);
              try{
             Thread.sleep(10);
             }catch(InterruptedException e){
                System.out.println(e);
             }
        }
       
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        b.setPriority(10); // which thread is more priority so give maximum priority
        a.setPriority(1);
        a.start(); // when using thread at a time using start method to call
        b.start();


    }
}
