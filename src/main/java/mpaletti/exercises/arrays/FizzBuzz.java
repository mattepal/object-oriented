package mpaletti.exercises.arrays;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end){
        if(start<0 || end==0 || start>=end){
            return new String[]{};
        }
        int num=start;
        String[] out=new String[end-start];
        for (int i=0;i<end-start;i++){
            if (num%3==0 && num %5==0){
                out[i]="FizzBuzz";
            }
            else if(num%3==0){
                out[i]="Fizz";
            }
            else if(num%5==0){
                out[i]="Buzz";
            }
            else {
                out[i]=Integer.toString(num);
            }
            num++;
        }
        return out;
    }
}
