package mpaletti.exercises.strings;

public class Concatenate {
    public static String concatenate(String[] strings){
        StringBuilder out= new StringBuilder();
        for (int i=0;i<strings.length;i++){
            out.append(strings[i]);
        }
        return out.toString();
    }
}
