package mpaletti.exercises.exceptions;

public class CheckLicencePlate {

    public static boolean controlLetter(String string){
        for(Character c:string.toCharArray()){
            if (Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
    public static boolean controlNumber(String string){
        for (Character c: string.toCharArray()){
            if (Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
    public static void checkLicencePlate(String licence){
        if (licence.length() == 7) {
        if (!controlLetter(licence.substring(0,2)) || !controlLetter(licence.substring(5,7)) || !controlNumber(licence.substring(2,5))){
            throw new IllegalArgumentException();
        }
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
