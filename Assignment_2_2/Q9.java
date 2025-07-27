import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[][] = new int [10][3];
        int rollNo[] = new int[10];
        int total[] = new int[10];
        double average[] = new double[10];

        for(int i = 0; i < 10;i++){
            System.out.print("Roll no student: " + (i+1) + ": " );
            rollNo[i] = sc.nextInt();
            System.out.println("Enter a 3 subject marks: ");
            for(int j = 0; j < 3;j++){
                System.out.print("Subject " + (j+1) + ": ");
                int mark = sc.nextInt();
                marks[i][j] = mark;
                total[i] += marks[i][j];
            }
            average[i] = total[i] / 3.0;
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d%-15d%-10.2f\n", rollNo[i], total[i], average[i]);
        }
    }
}
