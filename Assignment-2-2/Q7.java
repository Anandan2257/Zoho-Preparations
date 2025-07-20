import java.util.Scanner;
import java.util.ArrayList;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> weight = new ArrayList<>();
        for(int i = 0; i < 10;i++){
            int person = sc.nextInt();
            weight.add(person);
        }

        for(int i = 0; i < weight.size() - 1;i++){
            for(int j = 0; j < weight.size() - 1;j++){
                if(weight.get(j) < weight.get(j+1)){
                    continue;
                }
                else{
                    int temp = weight.get(j);
                    weight.set(j, weight.get(j + 1));
                    weight.set(j + 1, temp);
                }
            }
        }
        System.out.println(weight.toString());

    }
}
