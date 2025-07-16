package module_2.tasks.objects;

public class Rational {
    int numerator;
    int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

    public double mult(double number) {
        return number * numerator / denominator;
    }

    public double div(double number) {
        return (double) numerator / denominator / number;
    }

    public static void main(String[] args) {
        Rational oneForth = new Rational(1, 4);
        System.out.println(oneForth);
        System.out.println(oneForth.mult(16.1));
        System.out.println(oneForth.div(0.25));
    }

}
