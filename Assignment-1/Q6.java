public class Q6 {
    public static void main(String[] args) {
        int i = 22;
        long l = 12345L;
        float f = 12.12f;
        double d = 10.5678904321;
        System.out.println("-------------------------");
        System.out.println("Double to float " + (float) d);
        System.out.println("Double to long " + (long) d);
        System.out.println("Double to int " + (int) d);
        System.out.println("Double to byte " + (byte) d);
        System.out.println("-------------------------");
        System.out.println("Float to long " + (long) f);
        System.out.println("Float to int " + (int) f);
        System.out.println("Float to byte " + (byte) f);
        System.out.println("-------------------------");
        System.out.println("Long to int " + (int) l);
        System.out.println("Long to byte " +(byte)l);
        System.out.println("-------------------------");
        System.out.println("Int to byte " + (byte) i);
        System.out.println("-------------------------");
    }
}
