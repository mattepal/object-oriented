package mpaletti.exercises.oop.library;

import java.util.Objects;

public class Dvd extends Item {
    int length;

    public Dvd(String title, int year, int length) {
        super(title, year);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dvd dvd)) return false;
        return getLength() == dvd.getLength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength());
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "length=" + length +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
