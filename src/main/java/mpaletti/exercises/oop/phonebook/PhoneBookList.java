package mpaletti.exercises.oop.phonebook;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBookList implements PhoneBook{

    final ArrayList<Person> phoneBook;


    public PhoneBookList() {
        this.phoneBook =new ArrayList<Person>() ;
    }
    @Override
    public boolean addPerson(Person p) {
        if(phoneBook.contains(p) || phoneBook.size()>=MAX_PERSON){
            return false;
        }
        return phoneBook.add(p);
    }
    @Override
    public boolean removePerson(Person p) {
        return phoneBook.remove(p);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> tmp=new ArrayList<>();
        for(Person p:phoneBook){
            if(p.getLastname().equals(lastname)){
                tmp.add(p);
            }
        }
        return tmp.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp=new ArrayList();
        for(Person p:phoneBook){
            if(p.getName().equals(name) && p.getLastname().equals(name)){
                tmp.add(p);
            }
        }
        return  tmp.toArray(new Person[]{});
    }


}
