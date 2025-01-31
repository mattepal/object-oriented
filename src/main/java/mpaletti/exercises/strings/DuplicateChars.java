package mpaletti.exercises.strings;

public class DuplicateChars {
    public static char[] duplicateChars(String input){
        StringBuilder seen = new StringBuilder();
        StringBuilder recurring = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String tmp = String.valueOf(input.charAt(i));
            if (!seen.toString().contains(tmp)) {
                seen.append(tmp);
            } else if (!recurring.toString().contains(tmp)) {
                recurring.append(tmp);
            }
        }
        char[] result = recurring.toString().toCharArray();
        java.util.Arrays.sort(result);
        return result;
    }
}
