package mpaletti.exercises.exceptions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDates {
    public static boolean checkIntervalBetweenDates(String begin, String end) throws DateTimeParseException {
    LocalDate start=LocalDate.parse(begin);
    LocalDate dataend= LocalDate.parse(end);
    return !start.isAfter(dataend);
    }
}
