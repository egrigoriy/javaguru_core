package module_2;

import java.time.LocalTime;

public class Train {
    String number;
    String destination;
    LocalTime departureTime;

    public Train(String number, String destination, LocalTime departureTime) {
        this.number = number;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number='" + number + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }

    public static void main(String[] args) {
        Train t1 = new Train("123", "Moscow", LocalTime.of(12, 0));
        Train t2 = new Train("345", "Moscow", LocalTime.of(15, 0));
        Train t3 = new Train("234", "Piter", LocalTime.of(10, 0));
        Train t4 = new Train("456", "Kazan", LocalTime.of(9, 0));
        Train t5 = new Train("567", "Moscow", LocalTime.of(12, 15));
        System.out.println(t1);
        Train[] trains = new Train[5];
        trains[0] = t1;
        trains[1] = t2;
        trains[2] = t3;
        trains[3] = t4;
        trains[4] = t5;
        sortByNumberAsc(trains);
        printTrains(trains);
        sortByNumberDesc(trains);
        printTrains(trains);
        sortByDestination(trains);
        printTrains(trains);
    }

    private static void sortByDestination(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = i; j < trains.length; j++) {
                if (trains[i].destination.compareTo(trains[j].destination) > 0) {
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (trains[i].destination.compareTo(trains[j].destination) == 0) {
                    if (trains[i].departureTime.isAfter(trains[j].departureTime)) {
                        Train temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
    }

    static void printTrains(Train[] trains)  {
        System.out.println("+++++++++++++++++++++++++");
        for(Train train : trains) {
            System.out.println(train);
        }
        System.out.println("+++++++++++++++++++++++++");
    }

    private static void sortByNumberDesc(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = i; j < trains.length; j++) {
                if (trains[i].number.compareTo(trains[j].number) > 0) {
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    private static void sortByNumberAsc(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = i; j < trains.length; j++) {
                if (trains[i].number.compareTo(trains[j].number) < 0) {
                    Train temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }

        
    }


}
