package module_2.tasks.objects;

public class Clock {
    int alarmHours;
    int alarmMinutes;

    public String setAlarm(int hours, int minutes) {
        if ((hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59)) {
            this.alarmHours = hours;
            this.alarmMinutes = minutes;
            return "Alarm set to: " + this;
        } else {
            return "Your input time " + hours + ":" + minutes + " is not valid!";
        }
    }

    public String checkAlarm(int hours, int minutes) {
        return hours == alarmHours && minutes == alarmMinutes ? "Chime" : "";
    }

    public int checkTimeCount(int hours, int minutes) {
        if (minutes == 0) {
            return alarmHours > 12 ? alarmHours - 12 : alarmHours;
        }
        if (minutes % 15 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "alarmHours=" + alarmHours +
                ", alarmMinutes=" + alarmMinutes +
                '}';
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
        System.out.println(clock.setAlarm(24, 1));
        System.out.println(clock.setAlarm(17, 3));
        System.out.println();
        System.out.println(clock.checkAlarm(17, 2));
        System.out.println(clock.checkAlarm(17, 3));
        System.out.println();
        System.out.println(clock.checkTimeCount(17,0));
        System.out.println(clock.checkTimeCount(17,1));
        System.out.println(clock.checkTimeCount(17,15));
    }
}
