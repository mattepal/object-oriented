package mpaletti.exercises.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterItems {
    public static List<String> filterItems(List<String> strings){
        List<String> ret= new ArrayList<>();
        for (String s:strings){
            try {
                CheckString.checkString(s);
                ret.add(s);
            } catch (ParseException e) {
            }
        }
        return ret;
    }
}
