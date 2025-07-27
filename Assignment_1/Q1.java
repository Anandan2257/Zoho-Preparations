public class Q1{
    static int a = 10; //static variable
    int b = 12; //instance variable
    public static void main(String [] args){
        Q1 sc = new Q1();
        int c = 12; //Local 
        final int d = 10; //final

        System.out.println(a);
        System.out.println(sc.b);           
        System.out.println(c);
        System.out.println(d);
        {
            System.out.println(10);//blocks
        }
    }
}
