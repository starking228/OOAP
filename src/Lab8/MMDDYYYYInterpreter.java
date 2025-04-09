package Lab8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Конкретні інтерпретатори для кожного формату
class MMDDYYYYInterpreter implements DateExpression {
    @Override
    public LocalDate interpret(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return LocalDate.parse(date, formatter);
    }
}
