public class Reversing {
    public String reversing(String str,String str1){
        String name = str + str1;
        int len = name.length();
        String newName = "";
        for(int i = len - 1; i >= 0;i-- ){
            newName += name.charAt(i);
        }
        return newName;
    }
}
