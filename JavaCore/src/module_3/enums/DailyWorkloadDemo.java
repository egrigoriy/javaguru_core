package module_3.enums;

import java.util.ArrayList;

public class DailyWorkloadDemo {
    public static void main(String[] args) {
        ArrayList<Pair<Day, Integer>> workLoad = new ArrayList<>();
        workLoad.add(new Pair(Day.MONDAY, 8));
        workLoad.add(new Pair(Day.THUESDAY, 8));
        workLoad.add(new Pair(Day.WEDNESDAY, 7));
        workLoad.add(new Pair(Day.THURSDAY, 8));
        workLoad.add(new Pair(Day.FRIDAY, 8));
        workLoad.add(new Pair(Day.SATURDAY, 0));
        workLoad.add(new Pair(Day.SUNDAY, 0));

        for (Pair pair : workLoad) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
