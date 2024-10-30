package mpaletti.exercises.strings;

public class RemoveFirstTwoCharslf {
    public static String removeFirstTwoCharsIfCharAt(String string){
        StringBuilder out=new StringBuilder();
        switch (string.length()){
            case 0->{
            }
            case 1->{
                if (string.charAt(0)=='H'){
                    out.append('H');
                }
            }
            case 2->{
                if (string.charAt(0)=='H'){
                    out.append('H');
                }
                if (string.charAt(1)=='e'){
                    out.append('e');
                }
            }
            default -> {
                if (string.charAt(0)=='H'){
                    out.append('H');
                }
                if (string.charAt(1)=='e'){
                    out.append('e');
                }
                out.append(string.substring(2));
            }
        }
        return out.toString();
    }
    public static String removeFirstTwoCharsIfStringBuilder(String string){
    StringBuilder out=new StringBuilder(string);
    if (!string.isEmpty() && string.charAt(0)!='H'){
        out.deleteCharAt(0);
    }
    if (string.length()>1 && string.charAt(1)!='e' ){
        out.deleteCharAt(1);
    }
    return out.toString();
    }
}
