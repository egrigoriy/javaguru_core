package module_4.collections.map.task1;

import java.util.HashMap;
import java.util.Map;

class ToyMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> toyMap = new HashMap<>();
        Toy toy1 = new Toy("Nana", 3, 12.12);
        Toy toy2 = new Toy("Nintendo", 8    , 33);
        Toy toy3 = new Toy("Monopoly", 13, 34.21);
        toyMap.put("Nana", toy1);
        toyMap.put("Nintendo", toy2);
        toyMap.put("Monopoly", toy3);

        for (Map.Entry entry : toyMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println();
        for (String key : toyMap.keySet()) {
            System.out.println(key + " : " + toyMap.get(key));
        }
        System.out.println();
        for (Toy toy : toyMap.values()) {
            System.out.println(toy);
        }
    }
}
