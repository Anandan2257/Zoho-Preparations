import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        int grade = mark / 10;
        switch(grade){
            case 10:
            case 9:
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
            case 5:
                System.out.println("C");
                break;
            default:
                System.out.println("fail");
        }
        sc.close();
    }
}
