package mpaletti.exercises.strings;

import java.util.Locale;
import java.util.StringTokenizer;

public class CountYZ {
    public static int countYZ(String string){
        int countYZ=0;
        StringTokenizer token=new StringTokenizer(string);
        while (token.hasMoreTokens()){
            String tok=token.nextToken().toLowerCase();
            if(tok.endsWith("Y") ||tok.endsWith("Z")){
                countYZ++;
            }
        }
        return countYZ;
    }
}
