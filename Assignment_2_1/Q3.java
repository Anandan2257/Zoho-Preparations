public class Q3 {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 0; i < ((n * 2) - 1) + 1; i++){
            int value = i < n ? i + 1 : 2 * n - 1 - i;
            for(int j = 0; j < value; j++){
                System.out.print("W ");
            }
            System.out.println();
        }
        System.out.println();


        //pascal triangle

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
