public class Q5 {
    public static void main(String[] args) {
         int a = 10;
        int add = 0;
         for(int i = 0; i <= a;i++){
            if(i % 2 == 0){
                add += i;
            }
            else{
                continue;
            }
         }
         System.out.println(add);
    }
   
}
