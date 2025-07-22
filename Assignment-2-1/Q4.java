public class Q4 {
    public static void main(String[] args) {
        int n = 3;
        int count = 1;
        int rows = (n * 2) - 1;
        for(int i = 1; i < rows+1;i++){
            for(int space = 0;space < rows - i - 1;space++){
                System.out.print(" ");
            }
            for(int j = 1; j < i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
