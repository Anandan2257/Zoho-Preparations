/*Write a Java program where one thread prints only even numbers and another prints only odd 
numbers from 1 to 20. Synchronize the threads so that they print alternately (i.e., 1 2 3 4 ...). */

class NumberFind{
   int number = 1;
   int MaxNumber = 20;

   public synchronized void Odd(){
        while(number <= MaxNumber){
            if(number % 2 == 0){
                try{
                    wait();
                }catch(Exception e){
                    System.out.println(e);
                }
            }else{
                System.out.println("Odd: " + number);
                number++;
                 try{
                    Thread.sleep(500);
                }catch(Exception e){
                    System.out.println(e);
                }
                notify();
            }
        }
   }

   public synchronized void Even(){
        while(number <= 20){
            if(number % 2 != 0){
                try{
                    wait();
                }catch(Exception e){
                    System.out.println(e);
                }
            }else{
                System.out.println("Even: " + number);
                number++;
                try{
                    Thread.sleep(500);
                }catch(Exception e){
                    System.out.println(e);
                }
                notify();
            }
        }
   }
}

class EvenRunnable implements Runnable {
    NumberFind num;

    EvenRunnable(NumberFind num) {
        this.num = num;
    }

    public void run() {
        num.Even();
    }
}

class OddRunnable implements Runnable {
    NumberFind num;

    OddRunnable(NumberFind num) {
        this.num = num;
    }

    public void run() {
        num.Odd();
    }
}


public class Q3 {
    public static void main(String[] args) {
        NumberFind num = new NumberFind();

        EvenRunnable even = new EvenRunnable(num);
        Thread Even = new Thread(even);

        OddRunnable odd = new OddRunnable(num);
        Thread Odd = new Thread(odd);

        Even.start();
        Odd.start();

        try{
            Even.join();
            Odd.join();
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}
