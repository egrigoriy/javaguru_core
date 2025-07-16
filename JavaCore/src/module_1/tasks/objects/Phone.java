package module_1.tasks.objects;

public class Phone {
    String number;
    String model;
    int weight;


    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }
    
    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling!");
    }

    public void receiveCall(String callerName, String callerPhone) {
        System.out.println(callerName + " is calling from: " + callerPhone);
    }

    public void sendMessage(Phone[] receivers) {
        System.out.println("Send a message to:");
        for(Phone receiver : receivers) {
            System.out.println(receiver.getNumber());
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Phone nokia = new Phone("9150000000", "Nokia", 123);
        Phone alcatel = new Phone("9150000001", "Alcatel", 234);
        Phone siemens = new Phone("9150000002", "Siemens", 345);
        System.out.println(nokia);
        System.out.println(alcatel);
        System.out.println(siemens);
        System.out.println();
        nokia.receiveCall("Ivan");
        System.out.println(nokia.getNumber());
        System.out.println();
        alcatel.receiveCall("Petr");
        System.out.println(alcatel.getNumber());
        System.out.println();
        siemens.receiveCall("Sidor");
        System.out.println(siemens.getNumber());
        System.out.println();
        nokia.sendMessage(new Phone[]{alcatel, siemens});
    }
}
