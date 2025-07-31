
/*Write a Java program that shows exception propagation across multiple methods (method1 
calls method2 calls method3, which throws the exception). Handle the exception in method1. */
class Q7 {
    public static void main(String[] args) {
        try{
            multiple.method3();
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }    
}

class multiple{
    public static void method1(){
        int a = 10;
        int b = 0;
        int value = a / b;
    }

    public static void method2(){
        method1();
    }

    public static void method3(){
        method2();
    }
}