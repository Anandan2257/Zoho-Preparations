class Father{
    int a = 10;
    Father() 
    {
        System.out.println("A");
    }
}

class Son extends Father{
    int b = 12;
    Son() 
    {
        System.out.println("B");
    }
}

class Daughter extends Father{
    int c = 14;
    Daughter() {System.out.println("C");}
}

public class Q10 {
    public static void main(String args []){
    Father f1 = new Father();
    System.out.println(f1 instanceof Father);
    System.out.println(f1 instanceof Son);
    }
}
