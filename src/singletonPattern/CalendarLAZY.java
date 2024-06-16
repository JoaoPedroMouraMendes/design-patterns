package singletonPattern;

import java.util.HashMap;
import java.util.Map;

public class CalendarLAZY {
    private static CalendarLAZY INSTANCE = null;

    private Map<String, Boolean> days = new HashMap<>();

    private CalendarLAZY() {
        days.put("Domingo", true);
        days.put("Segunda", true);
        days.put("Terça", true);
        days.put("Quarta", true);
        days.put("Quinta", true);
        days.put("Sexta", true);
        days.put("Sabado", true);
    }

    public void occupyDay(String day) {
        days.replace(day, false);
    }

    public static CalendarLAZY getInstance() {
        if (INSTANCE == null)
            INSTANCE = new CalendarLAZY();
        return INSTANCE;
    }

    public Map<String, Boolean> getDays() {
        return days;
    }
}
