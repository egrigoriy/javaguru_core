package module_1;

public class TypesDemo {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println("Byte min value: " + Byte.MIN_VALUE);
        System.out.println("Byte max value: " + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("Short min value: " + Short.MIN_VALUE);
        System.out.println("Short max value: " + Short.MAX_VALUE);
        System.out.println();
        System.out.println("Int min value: " + Integer.MIN_VALUE);
        System.out.println("Int max value: " + Integer.MAX_VALUE);
        System.out.println();
        short sh = b;
        int i = sh;
        System.out.println("int is: " + i);
        long l = i;
        System.out.println("long is: " + l);
        char c = Character.MAX_VALUE;
        System.out.println("Char max value: " + c);
        short s = (short) c;
        System.out.println("Cast char max value to short" + s);
        float f = Integer.MAX_VALUE;
        System.out.println("Cast int max to float: " + f);

        byte bb = 1;
        short ss = 2;
        int ii = 10;
        long ll = 76328346;

        float ff = 1.4f;
        double dd = 243.234;

        char cc = 'r';

        boolean isTrue = true;

        ss = bb;
        System.out.println(ss);

        bb = (byte) ii;
        System.out.println(bb);

        ii = (int) dd;
        System.out.println(ii);
    }
}
