import java.io.*;
import java.util.Scanner;
public class FileExists{
	public static void main(String[] args) throws IOException{
		File file=new File("file1.txt");
		Scanner read=new Scanner(file);

		while(read.hasNextLine()){
			String data1=read.nextLine();
			System.out.println(data1);
		}










		/*if(file.exists()){
			System.out.println("File exists..."+file.getName());
		}else{
			System.out.println("File does not exists...");
			file.createNewFile();
			System.out.println("File created...");
		}

		FileWriter fw=new FileWriter(file);
		fw.write("Welcome to learn Java File Handling....");
		fw.close();

		FileReader fr=new FileReader(file);
		int data;
		while((data=fr.read())!=-1){
			System.out.print((char)data);
		}
		fr.close();

		FileWriter fw1=new FileWriter(file,true);
		fw1.write("Welcome to learn Java File Handling....");
		fw1.close();

		FileReader fr1=new FileReader(file);
		//int data;
		while((data=fr1.read())!=-1){
			System.out.print((char)data);
		}
		fr1.close();*/
	}
}