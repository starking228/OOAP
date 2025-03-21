package Lab8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DDMMYYYYInterpreter implements DateExpression {
    @Override
    public LocalDate interpret(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(date, formatter);
    }
}
