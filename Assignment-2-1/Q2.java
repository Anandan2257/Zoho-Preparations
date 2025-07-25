public class Q2 {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 0; i < ((n * 2) - 1) + 1; i++){
            int value = i < n ? i + 1 : 2 * n - 1 - i;
            for(int j = 0; j < value; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
