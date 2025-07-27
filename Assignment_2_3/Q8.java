import java.util.Scanner;

public class Q8 {

    public boolean result(String word){
        return (word.equals(word.toUpperCase()) ||
           word.equals(word.toLowerCase()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        Q8 res = new Q8();
        System.out.println(res.result(a));
    }    
}

