public class Main {
    public static void main(String[] args) {

        Add add = new Add();
        System.out.println("Sum: " + add.add(10, 20));

        Sub sub = new Sub();
        System.out.println("Sub: " + sub.sub(10, 20));

        Multiply multi = new Multiply();
        System.out.println("Multiply: " + multi.mul(1, 5));

        Division division = new Division();
        System.out.println("Division: " + division.division(10, 2));

        Mod mod = new Mod();
        System.out.println("Mod: " + mod.mod(5, 2));
    }
}

