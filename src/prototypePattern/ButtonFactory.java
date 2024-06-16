package prototypePattern;

public class ButtonFactory {
    public static Button getInstance(Button button) {
        return new Button.ButtonBuilder()
                .color(button.getColor())
                .size(button.getSize())
                .build();
    }
}
