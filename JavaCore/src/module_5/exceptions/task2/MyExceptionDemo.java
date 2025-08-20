package module_5.exceptions.task2;

public class MyExceptionDemo {
    public static void main(String[] args) {
        try {
           checkArg(0);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkArg(int i) throws MyException {
        if (i == 0) throw new MyException("Exception: I dont like 0!!!");
    }
}
