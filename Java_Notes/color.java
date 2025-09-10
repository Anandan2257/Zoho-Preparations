public class color{

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[34m";

    public static void main(String[] args) {
        System.out.println(RED + "This is red text" + RESET);
        System.out.println(YELLOW + "This is yellow text" + RESET);
    }
}
