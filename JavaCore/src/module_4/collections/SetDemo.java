package module_4.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet();
        hashSet.add("w");
        hashSet.add("z");
        hashSet.add("a");
        hashSet.add("w");
        for (Iterator<String> it = hashSet.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
