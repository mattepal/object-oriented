package mpaletti.exercises.arrays;

public class Splitter {
    public static int[] splitter(int input){
        String num=Integer.toString(input);
        int lenght=num.length();
        int[] out=new  int[lenght];
        for (int i=0;i<lenght;i++){
            out[i]=Character.getNumericValue(num.charAt(i));
        }
        return out;
    }

}
