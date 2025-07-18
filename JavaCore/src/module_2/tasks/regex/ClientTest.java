package module_2.tasks.regex;

public class ClientTest {
    public static void main(String[] args) {
        ClientValidator validator = new ClientValidator();
        Client c1 = new Client("my_email@gmail.com", "127.0.0.0", "https://www.labirint.ru/books/594619/", "fdsa");
        Client c2 = new Client("my_em ail@gmail.cwcom", "127.0.0.256", "https://www.labirint.ru/books/594619/", "fdsa");
        System.out.println(validator.validateEmail(c1.email));
        System.out.println(validator.validateIP(c1.ip));
        System.out.println(validator.validateUrl(c1.url));
        System.out.println(validator.validateAddress(c1.address));
    }





}
