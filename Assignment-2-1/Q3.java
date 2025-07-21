public class Q3 {
    public static void main(String[] args) {
        int a = 5;
        for(int i = 0; i < a;i++){
            for(int space = 0; space < a - i - 1;space++){
                System.out.print(" ");
            }

            int number = 1;

            for(int j = 0; j <= i ;j++){
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println(" ");
        }
    }
}
