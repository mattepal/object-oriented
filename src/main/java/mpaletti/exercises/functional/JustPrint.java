package mpaletti.exercises.functional;

import java.util.List;
import java.util.Map;

public class JustPrint {
    public static <T> void justPrintList(List<T> list){
        list.forEach(s->System.out.println("Hello "+ s+"!"));
    }
    public static <K,V> void justPrintMap(Map<K, V> map){
        map.forEach((a,t)->System.out.println("k:"+a+", v:"+t));
    }
}
