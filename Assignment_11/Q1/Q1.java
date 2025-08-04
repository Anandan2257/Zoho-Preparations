/*Write a Java program to read the contents of a text file and display it on the console. */

import java.io.FileReader;
public class Q1 {
    public static void main(String[] args) {
        try{
        FileReader fr = new FileReader("new.txt");
        StringBuilder content = new StringBuilder();
        int c = fr.read();
        while(c != -1){
            content.append((char)c);
            c = fr.read();
        }
        fr.close();
        System.out.println("File Content:\n" + content.toString());
    }catch(Exception e){
        System.out.println(e);
    }
    }
}
