package module_2.tasks.objects;

public final class FinalKeywordDemo {
    final int someValue = 4;

    public void changeWheels(int newNumber) {
        newNumber = 22;
        System.out.println(newNumber);
//        someValue = 44;
        final int wheel = 4;
//        wheel = 5;

    }
    public static void main(String[] args) {
        FinalKeywordDemo f = new FinalKeywordDemo();
        f.changeWheels(55);
    }
}
