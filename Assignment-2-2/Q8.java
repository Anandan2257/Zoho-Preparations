import java.util.Scanner;
import java.util.ArrayList;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> age = new ArrayList<>();
        for(int i = 0; i < 10;i++){
            int a = sc.nextInt();
            age.add(a);
        }

        ArrayList<Integer> lessThan18 = new ArrayList<>();
        ArrayList<Integer> between18To60 = new ArrayList<>(); 
        ArrayList<Integer> greaterThan60 = new ArrayList<>();  

        for(int i = 0; i < age.size();i++){
            if(age.get(i) > 60){
                greaterThan60.add(age.get(i));
            }else if(age.get(i) >= 18 && age.get(i) <= 60){
                between18To60.add(age.get(i));
            }else{
                lessThan18.add(age.get(i));
            }
        }

        System.out.println("Less than 18: " + lessThan18);
        System.out.println("Between 18 to 60: " + between18To60);
        System.out.println("Greater than 60: " + greaterThan60);

    }
}
