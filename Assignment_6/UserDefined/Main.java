import stringutils.Helper;
import arithmetic.Calci;
public class Main {
    public static void main(String[] args) {

        Calci ari = new Calci();
        System.out.println("Sum: " + ari.add(10, 20));

        System.out.println("Sub: " + ari.sub(10, 20));

        System.out.println("Multiply: " + ari.mul(1, 5));

        System.out.println("Division: " + ari.division(10, 2));

        System.out.println("Mod: " + ari.mod(5, 2));

        String str = "Zoho ";
        String str1 = "Anandan";

        Helper stringHelper = new Helper();
        System.out.println("Concat: " + stringHelper.concat(str, str1));

        System.out.println("Reversing: " + stringHelper.reversing(str, str1));
        
        System.out.println("Length: " + stringHelper.length(str1+str));
    }
}

