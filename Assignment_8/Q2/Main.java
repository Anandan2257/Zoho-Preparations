//Develop a Java program which illustrates the usage of Comparator Interface

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main{
    public static void main(String[] args) {
        
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer a, Integer b){
                if(a % 10 > b % 10){  //descending order of last digits using comparator
                    return 1;
                }
                return -1;
            }
        };
        List<Integer> li = new ArrayList<>();  
        
        li.add(21);
        li.add(12);
        li.add(19);
        li.add(32);

        Collections.sort(li);
        System.out.println("Change descending order: " + li.toString());

        Collections.sort(li,com);
        System.out.print("Change last digit descending order: " + li.toString());
    }
}