/*Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.
 */

class Count{
    int count = 0;
    int max = 20;
    public synchronized void add(){
        for(int i = 1 ; i <= 20; i++){
           while(count >= max){ 
                try{
                    wait();
                }catch(Exception e){
                    System.out.println(e);
            }
             }
             count++;
            System.out.println("Count Add: " + count);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            notifyAll();
        }
        }


    public synchronized void remove(){
        for(int i = 20 ; i >= 1; i--){
            while(count <= 0){
                try{
                    wait();
                }catch(Exception e){
                    System.out.println(e);
            }
        }
            System.out.println("Count Remove: " + count);
            count--;
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            notifyAll();
        }
        }
    }


class Product implements Runnable{
    Count count;

    Product(Count count){
        this.count = count;
    }
    public void run(){
        count.add();
    }
}

class Consumer implements Runnable{

    Count count;

    Consumer(Count count){
        this.count = count;
    }
    public void run(){
        count.remove();
    }
    
    
}
public class Q5 {
    public static void main(String[] args) {
        Count count = new Count();

        Product p = new Product(count);
        Thread add = new Thread(p);

        Consumer c = new Consumer(count);
        Thread remove = new Thread(c);

        add.start();
        remove.start();
        try{
            add.join();
            remove.join();
        }catch(Exception e){
            System.out.println(e);
        }


    }
}
