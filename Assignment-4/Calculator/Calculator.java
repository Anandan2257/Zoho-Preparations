import java.util.Scanner;
class BasicCalculator {
    int a;
    int b;

    void add(int a, int b){
        System.out.println("Addition: " + (a + b));
    }
    void subtract(int a , int b){
        System.out.println("Subtract: " + (a - b));
    }

    void multiply(int a , int b){
        System.out.println("Multiply: " + (a * b));
    }
    void divide(int a , int b){
        System.out.println("Multiply: " + (a / b));
    }
}

class AdvancedCalculator extends BasicCalculator{
    void power(int a, int b){
        System.out.println("Power: " + Math.pow(a,b));
    }

    void modulus(int a, int b){
        System.out.println("Modulus: " + Math.floorMod(a, b));
    }

    void squareRoot(double number){
        System.out.println("Root: " + Math.sqrt(number));
    }
}

class ScientificCalculator extends AdvancedCalculator{
    void sin(double number){
        System.out.println("Power: " + Math.sin(number));
    }

   void cos(double number){
        System.out.println("Power: " + Math.cos(number));
    }

    void log(double number){
        System.out.println("Power: " + Math.log(number));
    }
    void exp(double number){
        System.out.println("Power: " + Math.exp(number));
    }
}

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScientificCalculator cal = new ScientificCalculator();
        System.out.print("Add or Sub or Mul or Div or Pow or Mod or Root or Sin or Cos or Log or Exp : ");
        String str = sc.nextLine();

        int a = 0;
        int b = 0;
        double number = 0.0;

        if(str.equals("Root") || str.equals("Sin") || str.equals("Cos")|| str.equals("Log") || str.equals("Exp") ){
            System.out.print("Enter number : ");
            number = sc.nextDouble();
        }else{
            System.out.print("Enter a : ");
            a = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter b : ");
            b = sc.nextInt();
            sc.nextLine();
        }
        switch(str){
            case "Add":
                cal.add(a,b);
                break;
            case "Sub":
                cal.subtract(a,b);
                break; 
            case "Mul":
                cal.multiply(a,b);
                break;   
            case "Div":
                cal.divide(a,b);
                break;  
            case "Pow":
                cal.power(a,b);
                break; 
            case "Mod":
                cal.modulus(a,b);
                break; 
            case "Root":
                cal.squareRoot(number); 
                break; 
            case "Cos":
                cal.cos(number);
                break;    
            case "Sin":
                cal.sin(number);
                break; 
            case "Log":
                cal.log(number);  
                break; 
            case "Exp":
                cal.sin(number);  
                break;                  

        }
        
    }
} 