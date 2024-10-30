package mpaletti.exercises.oop.reverse;

public class ReverserFast implements  Reverser{

    @Override
    public String reverse(String s) {
        StringBuilder tmp=new StringBuilder(s);
        return tmp.reverse().toString();
    }
}
