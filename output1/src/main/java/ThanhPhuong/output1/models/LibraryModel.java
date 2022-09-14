package ThanhPhuong.output1.models;

import java.util.HashSet;
import java.util.Set;

public class LibraryModel {
    private int id;
    private Librarian librarian;
    private Set<Book> listBook = new HashSet<>();

    public LibraryModel() {

    }

    @Override
    public String toString() {
        return "LibraryModel{" +
                "id=" + id +
                ", librarian=" + librarian +
                ", listBook=" + listBook +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LibraryModel(int id, Librarian librarian, Set<Book> listBook) {
        this.id = id;
        this.librarian = librarian;
        this.listBook = listBook;
    }
}
