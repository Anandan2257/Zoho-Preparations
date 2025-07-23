public class Q2 {
    public String convertToTitle(int columnNumber) {
        char[] result = new char[10]; 
        int index = 0;

        while (columnNumber > 0) {
            columnNumber--;
            int rem = columnNumber % 26;
            result[index++] = (char)('A' + rem);
            columnNumber /= 26;
        }

        String res = "";
        for (int i = index - 1; i >= 0; i--) {
            res += result[i];
        }

        return res;
    }
}
