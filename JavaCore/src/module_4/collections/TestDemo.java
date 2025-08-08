package module_4.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestDemo {
    public static Iterator<String> reverse(List<String> list) {
        Collections.reverse(list);
        return list.iterator();
    }

    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "3");
        for (Iterator<String> it = reverse(list); it.hasNext(); ) {
            String str = it.next();
            System.out.println(str + ", ");
        }

    }
}
