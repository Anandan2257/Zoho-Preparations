public class Q5 {
    static{
        String name = "Anandan";
        System.out.println(name); //static block
    }

    {
        int age = 21;
        System.out.println(age); // 
    }

    int value = 10; //instance variable

    public static void main(String arg []){
        Q5 obj1 = new Q5();
        System.out.println(obj1.value);
        
    }
}
