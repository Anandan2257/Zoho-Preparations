import java.io.File;

class ListAllFiles {
  public static void main(String[] args) {

    // creates a file object
    //D:\JavaPractice
    File file = new File("D:\\JavaPractice");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}