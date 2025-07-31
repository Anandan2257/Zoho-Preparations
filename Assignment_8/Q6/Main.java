//Develop a Java program to illustrate pass-by-value

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
}

public class Main {
    public static void increment(int x){
            x++; // Don't Modifies the object via the reference
    }


    public static void changeName(Person p1) {
        p1.name = "Bala";  // Modifies the object via the reference
    }

    public static void main(String[] args) {
        int x = 10;
        increment(x);
        System.out.println(x); //no change only print 10 not increment
    

        Person p = new Person("Anand");
        changeName(p);
        System.out.println("Name: " + p.name); // Name: Bala
    }
}


