package mpaletti.exercises.functional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PhoneBook {
    final List<Person> people;



    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;
            return Objects.equals(getName(), person.getName()) && Objects.equals(getLastname(), person.getLastname()) && Objects.equals(getPhone(), person.getPhone());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getLastname(), getPhone());
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
    public PhoneBook(List<Person> people) {
        this.people = people;
    }
    public Optional<Person> searchByLastname(String lastname){
//        for (Person p:people){
//            if (p.getLastname().equals(lastname)){
//                return Optional.of(p);
//            }
//        }
//        return Optional.empty();
        return people.stream().filter(p->p.getLastname().equals(lastname)).findFirst();
    }
    public Optional<Person> searchByNameAndLastname(String name, String lastname){
        return people.stream().filter((p)->p.getName().equals(name) && p.getLastname().equals(lastname)).findFirst();
    }
}
