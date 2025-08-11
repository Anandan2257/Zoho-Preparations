/*Write a Java program that reads a file and prints the number of lines, words, and characters */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;
public class Q3 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("new.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String content : args){
                bw.write(content + " ");
            }
            bw.close();
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            FileReader fr = new FileReader("new.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int noOfLines = 0;
            StringBuilder content = new StringBuilder();
            while(line != null){
                noOfLines++;
                content.append(line);
                line = br.readLine();
            }
            System.out.println("Number of Lines: " + noOfLines);
            int noOfChar = 0;
            for(int i = 0; i < content.length();i++){
                if(content.charAt(i)  != ' '){
                    noOfChar++;
                }
            }
            System.out.println("Number of Char: " + noOfChar);

            int noOfWords = 0;
            for(int i = 0; i < content.length();i++){
                if(content.charAt(i)  == ' '){
                    noOfWords++;
                }
            }
            System.out.println("Number of Words: " + noOfWords);

            br.close();
            fr.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
