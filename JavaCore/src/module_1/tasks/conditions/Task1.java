package module_1.tasks.conditions;

public class Task1 {
    public static void main(String[] args) {
        int i = 1234;
        System.out.println("has " + i + " 7 at the end: " +  has7AtEnd(i));
        i = 34567;
        System.out.println("has " + i + " 7 at the end: " +  has7AtEnd(i));
    }

    private static boolean has7AtEnd(int n) {
        return (n % 10) == 7;
    }
}
