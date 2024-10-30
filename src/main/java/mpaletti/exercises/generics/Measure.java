package mpaletti.exercises.generics;

public class Measure {
    public interface  Measurer<T> {
        double measure(T t);
    }
    public static <T> T max(T[] array, Measurer<T> measurer){
        T max=array[0];
        for (T t: array){
            if (measurer.measure(t)>measurer.measure(max)){
                max=t;
            }
        }
        return max;
    }
    public static <T> T min(T[] array, Measurer<T> measurer){
        T min=array[0];
        for (T t:array){
            if (measurer.measure(t)<measurer.measure(min)){
                min=t;
            }
        }
        return min;
    }
}
