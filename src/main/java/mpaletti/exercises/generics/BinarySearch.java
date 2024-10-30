package mpaletti.exercises.generics;

public class BinarySearch {
    public static <T extends Comparable<T>> int find(T[] array, T key){
        return search(array,key,0,array.length-1);
    }
    public static <T extends Comparable<T>> int search(T[] array, T key,int low,int high){
        if (low>high){
            return -1;
        }
        int mid=(high+low)/2;
        if (array[mid].compareTo(key)>0){
            return search(array,key,low,mid-1);
        }
        if (array[mid].compareTo(key)<0){
            return search(array,key,mid+1,high);
        }
        if (array[mid].compareTo(key)==0){
            return mid;
        }
        return -1;
    }
}
