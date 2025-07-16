package module_2;

public class StringPoolDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");
        String s5 = s3.intern();
        System.out.println("Same literals: " + (s1==s2));
        System.out.println("Literal and reference: " + (s1==s3));
        System.out.println("Literal and String intern(): " + (s1==s5));
        System.out.println("References == : " + (s3==s4));
        System.out.println("References equals: " + s3.equals(s4));
    }
}
