package ThanhPhuong.output1.models;

import java.util.List;

public class LibraryDTO {
    public int id;
    private String name;
    private int librarianId;
    private List<Integer> bookId;


    public LibraryDTO(int id, String name, Integer librarianId, List<Integer> bookId) {
        this.id = id;
        this.name = name;
        this.librarianId = librarianId;
        this.bookId = bookId;
    }

    public List<Integer> getBookId() {
        return bookId;
    }

    public void setBookId(List<Integer> bookId) {
        this.bookId = bookId;
    }

    public Integer getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(Integer librarianId) {
        this.librarianId = librarianId;
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


}
