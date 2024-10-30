package mpaletti.exercises.strings;

public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String s){
        if (s.length()>5){
            return false;
        }
        if(s.startsWith("good") || s.startsWith("good",1)){
            return true;
        }
//        String a=s.substring(0,4);
//        String b=s.substring(1,5);
//        if (a.equals("good") || b.equals("good")){
//            return true;
//        }
//        return false;
        return false;

    }
}
