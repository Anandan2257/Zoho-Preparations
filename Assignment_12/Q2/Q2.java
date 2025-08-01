/*Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times 
with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and 
start both threads.
--->The console should reflect the concurrent execution of both tasks. */

class TaskRunner implements Runnable{
    public void run(){
       for(int i = 1; i <= 10;i++){
            try{
                System.out.println("Thread " + i + " : TaskRunner");
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        TaskRunner t = new TaskRunner();
        Thread thread= new Thread(t);
        thread.start();
    }
}
