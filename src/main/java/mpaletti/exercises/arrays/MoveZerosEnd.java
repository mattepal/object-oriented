package mpaletti.exercises.arrays;

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v){
        int[] out=new int[v.length];
        int cnt=0;
        for (int i=0;i<v.length;i++){
            if(v[i]!=0){
                out[cnt]=v[i];
                cnt++;
            }
        }
        return out;
    }
}
