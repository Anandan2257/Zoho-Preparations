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

        String str = "Zoho ";
        String str1 = "Anandan";

        Concat concat = new Concat();
        System.out.println("Concat: " + concat.concat(str, str1));

        Reversing reversing = new Reversing();
        System.out.println("Reversing: " + reversing.reversing(str, str1));
        
        Length length = new Length();
        System.out.println("Length: " + length.length(str1+str));
    }
}

