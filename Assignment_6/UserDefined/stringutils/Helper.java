package stringutils;
public class Helper{

    public String concat(String str, String str1) {
        return str + str1;
    }

    public int length(String str) {
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // Stop when IndexOutOfBoundsException occurs
        }
        return length;
    }

    public String reversing(String str, String str1) {
        String name = str + str1;
        int len = name.length();

        StringBuilder reversed = new StringBuilder();
        for (int i = len - 1; i >= 0; i--) {
            reversed.append(name.charAt(i));
        }

        return reversed.toString();
    }
}
