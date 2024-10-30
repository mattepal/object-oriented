package mpaletti.exercises.collections;

import java.util.HashMap;
import java.util.Map;

public class InvertMap {
    public static Map<String, Integer> invertMap(Map<Integer, String> src){
        Map<String,Integer> ret=new HashMap<>();
        for (Map.Entry<Integer,String> entry:src.entrySet()){
            ret.put(entry.getValue(),entry.getKey());
        }
        return ret;
    }
}
