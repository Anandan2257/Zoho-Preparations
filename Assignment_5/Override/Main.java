class Parent {
    // Private method - Not inherited, so can not be overridden
    private void privateMethod() {
        System.out.println("Parent private method");
    }
    
    Parent() {
        System.out.println("Parent constructor");
    }

    // Static method - Can be hidden, not overridden
    static void staticMethod() {
        System.out.println("Parent static method");
    }

    // Final method - Cannot be overridden
    final void finalMethod() {
        System.out.println("Parent final method");
    }

    // Normal method - Can be overridden
    void normalMethod() {
        System.out.println("Parent normal method");
    }
}

class Child extends Parent {

    private void privateMethod() {
        System.out.println("Child private method");
    }

    // Constructor - Not an override
    Child() {
        System.out.println("Child constructor");
    }

    // Static method - this hides the parent method, not overrides
    static void staticMethod() {
        System.out.println("Child static method");
    }

    @Override
    void normalMethod() {
        System.out.println("Child normal method");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child();

        obj.normalMethod();       // Output - Child normal method
        obj.finalMethod();        // Output - Parent final method
        obj.staticMethod();       // Output - Parent static method (static binding)

    }
}
