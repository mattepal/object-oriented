package mpaletti.exercises.strings;

public class Reverse {
    public static String reverseCharAt(String string){
        StringBuilder ret= new StringBuilder();
        for(int i=string.length()-1;i>=0;i--){
            ret.append(string.charAt(i));
        }
       return ret.toString();
    }
    public static String reverseStringBuilder(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
