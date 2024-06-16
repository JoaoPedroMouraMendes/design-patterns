package singletonPattern;

import java.util.HashMap;
import java.util.Map;

public enum CalendarEnum {
    INSTANCE;

    private Map<String, Boolean> days = new HashMap<>();

    private CalendarEnum() {
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

    public static CalendarEnum getInstance() {
        return INSTANCE;
    }

    public Map<String, Boolean> getDays() {
        return days;
    }
}
