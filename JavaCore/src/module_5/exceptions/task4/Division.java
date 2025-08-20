package module_5.exceptions.task4;

import java.util.random.RandomGenerator;

class Division {
    public static void main(String[] args) {
        Division division = new Division();
        double result = division.divide("24", "4", "4");
        System.out.println(result);
        // Division by 0
        try {
            result = division.divide("24", "4", "0");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // No args exception
        try {
            result = division.divide();
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public Double divide(String ...args) {
        if (args.length == 0) throw new IllegalArgumentException("You must provide at least 1 argument");
        if (args.length == 1) return (double)toInt(args[0]);
        double result = (double)toInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            int divisor = toInt(args[i]);
            if (divisor == 0) throw new ArithmeticException("Division by 0!!!");
           result = result / divisor;
        }
        return result;
    }

    public Integer toInt(String s) {
        return Integer.parseInt(s);
    }
}
