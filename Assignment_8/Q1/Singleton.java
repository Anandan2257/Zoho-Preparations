//Illustrates with an example of using Singleton class

class SingletonClass{
    static SingletonClass s = null; // create object...

    private SingletonClass(){

    }

    public static SingletonClass getSingletonClass(){
        if(s == null){
            s = new SingletonClass();
        }
        return s;
    }
}

public class Singleton {
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getSingletonClass();
        SingletonClass s2 = SingletonClass.getSingletonClass();

        System.out.println("Same Class SingletonClass: "+ s1 + " == " + s2);
        newSingleton n = new newSingleton();
        n.display();
    }
}

class newSingleton{
    void display(){
         SingletonClass s3 = SingletonClass.getSingletonClass();
         System.out.println("New Singleton: " + s3);
    }
}
