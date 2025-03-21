package Lab8;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

// Контекст для вибору інтерпретатора
class DateInterpreterContext {
    private final Map<String, DateExpression> interpreters = new HashMap<>();

    public DateInterpreterContext() {
        interpreters.put("MM-DD-YYYY", new MMDDYYYYInterpreter());
        interpreters.put("DD-MM-YYYY", new DDMMYYYYInterpreter());
        interpreters.put("YYYY-MM-DD", new YYYYMMDDInterpreter());
    }

    public LocalDate interpret(String format, String date) {
        DateExpression interpreter = interpreters.get(format);
        if (interpreter != null) {
            return interpreter.interpret(date);
        }
        throw new IllegalArgumentException("Невідомий формат дати: " + format);
    }
}
