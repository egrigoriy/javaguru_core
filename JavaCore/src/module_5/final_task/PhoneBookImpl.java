package module_5.final_task;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class PhoneBookImpl implements PhoneBook {
    private List<PhoneBookRecord> records = new ArrayList<>();

    @Override
    public void addUser(String name, int number, LocalDate createdDate) {
        records.add(new PhoneBookRecord(name, number, createdDate));
    }

    @Override
    public int getNumberByName(String name) {
        return records.stream()
                .filter(record -> name.equals(record.name()))
                .findFirst()
                .get()
                .number();
    }

    @Override
    public String getNameByNumber(int number) {
        return records.stream()
                .filter(record -> number == record.number())
                .findFirst()
                .get()
                .name();
    }

    @Override
    public void storeToFile(File phoneBookFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(phoneBookFile))) {
            records.stream()
                    .map(record -> record.name() + "," + record.number() + "," + record.createdDate() + "\n")
                    .forEach(s -> {
                        try {
                            writer.write(s);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void loadFromFile(File phoneBookFile) {
        List<PhoneBookRecord> redRecords = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(phoneBookFile))) {
            String line;
           while ((line = reader.readLine()) != null) {
               String[] data = line.split(",");
               String name = data[0];
               int number = Integer.parseInt(data[1]);
               LocalDate date = LocalDate.parse(data[2]);
               redRecords.add(new PhoneBookRecord(name, number, date));
           }
           records = redRecords;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printAllUsers() {
        records.forEach(System.out::println);
    }
}
