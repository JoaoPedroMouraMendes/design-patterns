import builderPattern.User;
import factoryPattern.EnumProductType;
import factoryPattern.Product;
import factoryPattern.ProductFactory;

public class Main {
    public static void main(String[] args) {
//        User user = new User.UserBuilder()
//                .name("John")
//                .lastName("Mendes")
//                .email("johnmendes@gmail.com")
//                .password("123")
//                .build();
//
//        System.out.println(user.toString());

        Product product1 = ProductFactory.getInstance(EnumProductType.DIGITAL);
        Product product2 = ProductFactory.getInstance(EnumProductType.PHYSICAL);

        System.out.println(product1);
        System.out.println(product2);
    }
}