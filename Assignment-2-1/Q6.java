public class Q6 {
    public static void main(String[] args) {
        int a = 30;
        String binary = "";
        while(a > 0){
            binary = (a % 2)+ binary;
            a = a / 2;
        }
        System.out.println(binary);
    }
}
