public class Q5 {
    public static void main(String[] args) {
        char a[] = {'m','n','o','p'};
        char b[] = {'m','n','o','p'};

        boolean result = true;
        if(a.length != b.length){
            result = false;
        }

        for(int i = 0; i < a.length;i++){
            if(a[i] != b[i]){
                result = false;
                break;
            }
            result = true;
        }
        System.out.println(result);
    }
}
