package module_5.final_task;

import java.io.File;
import java.time.LocalDate;

class PhoneBookDemo {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBookImpl();
        phoneBook.addUser("Ivan", 123, LocalDate.now());
        phoneBook.addUser("Petr", 345, LocalDate.now());
        phoneBook.storeToFile(new File("phonebook.txt"));

        PhoneBook phoneBook2 = new PhoneBookImpl();
        phoneBook2.loadFromFile(new File("phonebook.txt"));
        System.out.println(phoneBook2.getNameByNumber(123).equals("Ivan"));
        System.out.println(phoneBook2.getNumberByName("Petr") == 345);
        phoneBook2.printAllUsers();
    }
}
