import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class Q4 {
    public static void main(String[] args) {
        try{
        FileWriter fw = new FileWriter("new.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(String content: args){
            bw.write(content + " ");
        }
        bw.newLine();
        bw.close();
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            FileReader fr = new FileReader("new.txt");
            BufferedReader br = new BufferedReader(fr);
            StringBuilder content = new StringBuilder();
            String line = br.readLine();
            while(line != null){
                content.append(line);
                line = br.readLine();
            }
            br.close();
            fr.close();
            System.out.println("File Content: " + content.toString());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
