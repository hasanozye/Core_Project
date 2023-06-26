package day58;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets3 {
    public static void main(String[] args) {
        Set<Book> books = new TreeSet<>(Comparator.comparing(Book::getName).reversed());
        books.addAll(List.of(
                new Book(1,"Java 11"),
                new Book(2,"Python"),
                new Book(3,"C#")
        ));

        books.forEach(System.out::println);

    }
}

class Book {
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
