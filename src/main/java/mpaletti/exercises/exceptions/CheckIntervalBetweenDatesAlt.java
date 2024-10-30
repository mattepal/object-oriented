package mpaletti.exercises.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class CheckIntervalBetweenDatesAlt {
    public static boolean checkIntervalBetweenDatesAlt(String begin, String end) {

        try {
            LocalDate dateStart= LocalDate.parse(begin);
            LocalDate dateEnd =LocalDate.parse(end);
            return dateStart.isBefore(dateEnd);
        }
        catch (DateTimeParseException e){
            return false;
        }
    }
}
