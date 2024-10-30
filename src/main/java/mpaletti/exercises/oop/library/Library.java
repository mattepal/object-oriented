package mpaletti.exercises.oop.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    ArrayList<Rent> rents;

    public Library() {
        rents=new ArrayList<Rent>();
    }
    public boolean addRent(Rent rent){
        return rents.add(rent);
    }
    public boolean removeRent(Rent rent){
        return rents.remove(rent);
    }
    public ArrayList<Rent> getExpired(LocalDate now){
        ArrayList<Rent> ret=new ArrayList<Rent>();
        for (Rent rent:rents){
            if (rent.isExpired(now)){
                ret.add(rent);
            }
        }
        return ret;
    }
}
