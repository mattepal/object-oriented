package mpaletti.exercises.strings;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoCharsCharAt(String string){
        StringBuilder out=new StringBuilder();
        for(int i=0;i<string.length();i++){
            if(i>1){
                out.append(string.charAt(i));
            }
        }
        return out.toString();
    }
    public static String removeFirstTwoCharsStringBuilder(String string){
        return new StringBuilder(string).delete(0,2).toString();
    }
}
