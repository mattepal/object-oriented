package mpaletti.exercises.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements  PhoneBook{
    final Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook=new Person[MAX_PERSON];
    }
    @Override
    public boolean addPerson(Person p) {
        for (int i=0;i<MAX_PERSON;i++){
            if(phoneBook[i].equals(p) && phoneBook[i]!=null){
                return false;
            }
        }
        for(int i=0;i< MAX_PERSON;i++){
            if(phoneBook[i]==null){
                phoneBook[i]=p;
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean removePerson(Person p) {
        for (int i=0;i<MAX_PERSON;i++){
            if(phoneBook[i].equals(p) && phoneBook[i]!=null){
                phoneBook[i]=null;
                return  true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        int cnt=0;
        Person[] tmp= new Person[MAX_PERSON];
        for (int i=0;i<MAX_PERSON;i++){
            if (phoneBook[i].getLastname().equals(lastname) && phoneBook[i]!=null){
                tmp[cnt]=phoneBook[i];
                cnt++;
            }
        }
        return Arrays.copyOf(tmp,cnt);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        int cnt=0;
        Person[] tmp=new Person[MAX_PERSON];
        for (int i=0;i<MAX_PERSON;i++){
            if (phoneBook[i]!=null && phoneBook[i].getName().equals(name) && phoneBook[i].getLastname().equals(lastname)){
                tmp[cnt]=phoneBook[i];
                cnt++;
            }
        }
        return Arrays.copyOf(tmp,cnt);
    }


}
