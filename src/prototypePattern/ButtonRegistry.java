package prototypePattern;

import java.util.HashMap;
import java.util.Map;

public class ButtonRegistry {
    private static final Map<String, Button> registry = new HashMap<>();

    static {
        Button redButton = new Button.ButtonBuilder()
                .color("red")
                .size(4)
                .build();
        Button blueButton = new Button.ButtonBuilder()
                .color("blue")
                .size(4.75f)
                .build();
        registry.put("red", redButton);
        registry.put("blue", blueButton);
    }

    public static Button getButton(String key) {
        return ButtonFactory.getInstance(registry.get(key));
    }
}
