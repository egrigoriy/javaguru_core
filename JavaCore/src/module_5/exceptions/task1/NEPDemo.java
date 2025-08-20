package module_5.exceptions.task1;

public class NEPDemo {
    public static void main(String[] args) {
        String s = null;
        try {
            s.length();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
