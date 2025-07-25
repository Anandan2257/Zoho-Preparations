import java.util.Scanner;

class Mystring{
    String name;

    Mystring(String name){
        this.name = name;
    }

    int length(){
        return name.length();
    }

    char charAt(int index){
        char value = 0;
        for(int i = 0; i < name.length();i++){
            if(i == index){
                value += name.charAt(i);
            }
        }
        return value;
    }

    boolean equals(String CheckEqual){
        if(name.equals(CheckEqual)){
            return true;
        }
        return false;
    }

    String toUpperCase(){
        String value = "";
        for(int i = 0; i < name.length();i++){
            char ch = name.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            value += (char)(ch - 'a' + 'A'); 
        } else {
            value += ch;
        }
        }
        return value;
    }

    String toLowerCase(){
        String value = "";
        for(int i = 0; i < name.length();i++){
            char ch = name.charAt(i);
        if (ch >= 'A' && ch <= 'Z') {
            value += (char)(ch - 'A' + 'a'); 
        } else {
            value += ch;
        }
        }
        return value;
    }

     String substring(int start, int end){
        return name.substring(start,end);
     }

     String concat(String newName){
        return name.concat(newName);
     }

     int indexOf(char ch){
        int value = -1;
        for(int i = 0; i < name.length();i++){
            if(name.charAt(i) == ch){
                value = i;
                break;
            }
        }
        return value;
     }

     String replace(char oldChar, char newChar){
        String value = "";

        for(int i = 0; i < name.length();i++){
            if(name.toLowerCase().charAt(i) == oldChar){
                value += newChar;
            }
            else{
            value += name.charAt(i);
            }
        }
        return value;
     }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String name = sc.nextLine();
        Mystring string = new Mystring(name);

        System.out.println("Length: " + string.length());

        System.out.print("Enter a Index: ");
        int index = sc.nextInt();
        System.out.print("Index: " + string.charAt(index));
        sc.nextLine();
        System.out.println();

        System.out.print("Check Equal Name or not: ");
        String checkName = sc.nextLine();
        System.out.println("Equal or Not: " + string.equals(checkName));

        System.out.println("UpperCase: " + string.toUpperCase());

        System.out.println("LowerCase: " + string.toLowerCase());
        System.out.print("Enter a Strat Index: ");
        int start = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a End Index: ");
        int end = sc.nextInt();
        sc.nextLine();
        System.out.println("Substring : " + string.substring(start, end));

        System.out.print("Enter Another Name: ");
        String newName = sc.nextLine();

        System.out.println("Concat: " + string.concat(newName));

        System.out.print("Enter first occurrence of the character: ");
        char character = sc.next().charAt(0);
        System.out.println("first occurrence of the character:  " + string.indexOf(character));

        System.out.print("Enter a oldChar: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter a newChar: ");
        char newChar = sc.next().charAt(0);

        System.out.println("Replaces all occurrences: " + string.replace(oldChar, newChar));

    }    
}
