package module_7.lambda;

public class UserBuilderDemo {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User ivan = userBuilder.create("Ivan");
        User peter = userBuilder.create("Peter");
        System.out.println(ivan.getName());
        System.out.println(peter.getName());
    }
}

@FunctionalInterface
interface UserBuilder {
    User create(String name);
}
class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
