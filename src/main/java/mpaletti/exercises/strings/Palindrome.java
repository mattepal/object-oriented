package mpaletti.exercises.strings;

public class Palindrome {
    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return false;
        }
        String revers= new StringBuilder(s).reverse().toString();
        if(revers.equalsIgnoreCase(s)){
            return true;
        }
        return false;
    }
}
