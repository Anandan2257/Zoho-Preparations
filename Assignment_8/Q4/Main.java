//Get some strings through the command-line prompt and use an array to store and display them

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No lines");
        }

        ArrayList<String> arr = new ArrayList<>();

        for(int i = 0; i < args.length;i++){
            arr.add(args[i]);
        }

        Iterator <String> i = arr.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
