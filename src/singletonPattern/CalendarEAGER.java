package singletonPattern;

import java.util.HashMap;
import java.util.Map;

public class CalendarEAGER {
    private static final CalendarEAGER INSTANCE = new CalendarEAGER();

    private Map<String, Boolean> days = new HashMap<>();

    private CalendarEAGER() {
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

    public static CalendarEAGER getInstance() {
        return INSTANCE;
    }

    public Map<String, Boolean> getDays() {
        return days;
    }
}
