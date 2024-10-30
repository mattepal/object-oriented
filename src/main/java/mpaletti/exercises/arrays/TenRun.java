package mpaletti.exercises.arrays;

public class TenRun {
    public static int[] tenRun(int[] v){
        int mult=0;
        for(int i=0;i<v.length;i++){
            if(v[i]!=0 && v[i]%10==0){
                mult=v[i];
            }
            else if(mult!=0){
                v[i]=mult;
            }
        }
        return v;
    }
}
