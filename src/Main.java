import builderPattern.User;
import factoryPattern.EnumProductType;
import factoryPattern.Product;
import factoryPattern.ProductFactory;
import prototypePattern.Button;
import prototypePattern.ButtonRegistry;
import proxyPattern.Calculator;
import proxyPattern.CalculatorProxy;
import singletonPattern.CalendarEAGER;
import singletonPattern.CalendarEnum;

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


//        Product product1 = ProductFactory.getInstance(EnumProductType.DIGITAL);
//        Product product2 = ProductFactory.getInstance(EnumProductType.PHYSICAL);
//
//        System.out.println(product1);
//        System.out.println(product2);


//        CalendarEAGER calendar = CalendarEAGER.getInstance();
//        calendar.occupyDay("Domingo");
//        calendar.occupyDay("Sabado");
//        System.out.println(calendar.getDays());
//
//        CalendarEAGER calendar2 = CalendarEAGER.getInstance();
//        calendar2.occupyDay("Domingo");
//        calendar2.occupyDay("Sabado");
//        System.out.println(calendar2.getDays());
//
//        CalendarEnum calendar3 = CalendarEnum.getInstance();
//        calendar3.occupyDay("Domingo");
//        calendar3.occupyDay("Sabado");
//        System.out.println(calendar3.getDays());


//        Button redButton = ButtonRegistry.getButton("red");
//        redButton.setSize(20);
//        System.out.println(redButton);
//        System.out.println(ButtonRegistry.getButton("red"));

        CalculatorProxy calculator = new CalculatorProxy();
        calculator.sum(1, 2);
    }
}