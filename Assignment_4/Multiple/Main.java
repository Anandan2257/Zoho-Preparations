class A {
    void show() {
        System.out.println("Class A");
    }
}

class B {
    void show() {
        System.out.println("Class B");
    }
}

/*
class C extends A, B {
    // Compilation Error: Java does not support multiple inheritance with classes
}
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Java does not support multiple inheritance using classes.");
    }
}
