package mpaletti.exercises.oop.basic;

public class ClickCounter {
    int value;

    public int getValue() {
        return value;
    }
    public void click(){
        value+=1;
    }
    public void undo(){
//        if (value>0){
//            value-=1;
//        }
        value=Math.max(value -1,0);
    }
    public void reset(){
        value=0;
    }
}
