package mpaletti.exercises.oop.reverse;

import java.util.Arrays;

public class ReverserSlow implements Reverser {

    @Override
    public String reverse(String s) {
        char[] tmp=new char[s.length()];
        for (int i=0;i<s.length();i++){
            tmp[s.length()-1-i]=s.charAt(i);
        }
        return tmp.toString();
    }
}
