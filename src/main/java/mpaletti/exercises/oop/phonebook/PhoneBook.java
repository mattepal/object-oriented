package mpaletti.exercises.oop.phonebook;

public interface PhoneBook {
    static final int MAX_PERSON=256;

    boolean removePerson(Person p);
    Person[] searchByLastname(String lastname);
    Person[] searchByNameAndLastname(String name, String lastname);
    boolean addPerson(Person p);
}
