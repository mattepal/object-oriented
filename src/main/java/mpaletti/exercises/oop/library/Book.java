package mpaletti.exercises.oop.library;

import java.util.Objects;

public class Book extends Item {

    int page;

    public Book(String title, int year, int page) {
        super(title, year);
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getPage() == book.getPage();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPage());
    }

    @Override
    public String toString() {
        return "Book{" +
                "page=" + page +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
