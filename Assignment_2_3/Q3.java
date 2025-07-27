public class Q3 {

 public static boolean isVowel(char ch) {
    switch (Character.toLowerCase(ch)) {
        case 'a': 
        case 'e': 
        case 'i': 
        case 'o':
        case 'u':
            return true;
        default:
            return false;
    }
}
   
 public static void main(String[] args) {
    String s = "hello";
    StringBuilder sb = new StringBuilder(s);

    int l = 0;
    int r = s.length() - 1;

    while(l < r){
        if(isVowel(s.charAt(l)) && isVowel(s.charAt(r))){
            char temp = sb.charAt(l);
            sb.setCharAt(l,sb.charAt(r));
            sb.setCharAt(r, temp);
            l++;
            r--;
        }else if(isVowel(sb.charAt(l))){
            r--;
        }else{
            l++;
        }
    }
    System.out.println(sb);
 }   
}
