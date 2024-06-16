import User.User;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .name("John")
                .lastName("Mendes")
                .email("johnmendes@gmail.com")
                .password("123")
                .build();

        System.out.println(user.toString());
    }
}