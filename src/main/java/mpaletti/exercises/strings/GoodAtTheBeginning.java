package mpaletti.exercises.strings;

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String s){
        if(s.length()<4){
            return false;
        }
        if(s.charAt(0)=='g'&& s.charAt(1)=='o'&& s.charAt(2)=='o'&& s.charAt(3)=='d'){
            return true;
        }
        /*return s.startWith("good");*/
        return false;
    }
}
