

public class Q3 {
    public static void main(String[] args){
        try{
         Class.forName("Example");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
