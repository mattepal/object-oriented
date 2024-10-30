package mpaletti.exercises.collections;

import java.util.Map;

public class RomanToDecimal {
    private static Map<Character,Integer> conversionMap(){
        return Map.of(
                'I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000
        );
    }
    public static int romanToDecimal(String s){
        Map<Character,Integer> converionMap=conversionMap();
        int number=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && converionMap.get(s.charAt(i))<converionMap.get(s.charAt(i+1))){
                number-=converionMap.get(s.charAt(i));
            }
            else {
                number+=converionMap.get(s.charAt(i));
            }
        }
        return number;
    }
}
