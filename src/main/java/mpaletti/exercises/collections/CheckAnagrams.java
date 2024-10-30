package mpaletti.exercises.collections;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
    public static boolean areAnagrams(String first, String second){
        if (first.length()!=second.length()){
            return false;
        }
        Map<Character,Integer> appearanceFirst= stringToAppearencesMap(first);
        Map<Character,Integer> appearanceSecond= stringToAppearencesMap(first);
        return appearanceFirst.equals(appearanceSecond);
    }

    private static Map<Character, Integer> stringToAppearencesMap(String string) {
        Map<Character, Integer> appearances = new HashMap<>();
        for (Character c : string.toLowerCase().toCharArray()) {
            int numOfAppearances = appearances.getOrDefault(c, 0);
            appearances.put(c, numOfAppearances + 1);
        }
        return appearances;
    }
}
