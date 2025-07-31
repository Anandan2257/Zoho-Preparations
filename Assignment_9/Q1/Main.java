
/*Program to check if person is eligible to vote or not.
int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during 
execution. */

public class Main {
    public static void main(String[] args) {
        try{
        int[] arr = {2, 5, 1, 4, 0, 7};
        int quotient = arr[7] / arr[4];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter valid index: " + e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

