import java.util.Scanner;

public class Q4 {
    void print(int n) {
        int arr[] = new int[n];
        int sumOfSingle = 0;
        int sumOfDouble = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < 10) {
                sumOfSingle += arr[i];
            } else {
                sumOfDouble += arr[i];
            }
        }

        System.out.println("Sum Of Single Digit: " + sumOfSingle);
        System.out.println("Sum Of Double Digit: " + sumOfDouble);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        Q4 result = new Q4();
        result.print(n);
    }
}
