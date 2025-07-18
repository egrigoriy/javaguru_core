package module_3.oop.animals;

public class Dog extends Animal {
    public void voice(String angryVoice) {
        System.out.println(angryVoice);

    }

    public void voice(int times) {
        for (int i = 0; i < times; i++) {
            voice();
        }
    }
}
