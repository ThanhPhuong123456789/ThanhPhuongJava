package ThanhPhuong.output1.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 *
 * @author pankaj
 */
@Entity
@Table(name = "Library")
public class Library {
    @Id
    @Column(name = "id_library")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name ="id_librarian", referencedColumnName = "id")
    @JsonManagedReference
    private Librarian librarian;
    public Library(int id, Librarian librarian, Set<Book> listBook, String name) {
        this.id = id;
        this.listBook = listBook;
        this.name = name;
    }
    public Library() {
    }
    public Librarian getLibrarian() {
        return librarian;
    }
    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }
    @OneToMany(fetch = FetchType.LAZY,mappedBy="library")
    private Set<Book> listBook = new HashSet<>();

    public Set<Book> getListBook() {
        return listBook;
    }

    public void setListBook(Set<Book> listBook) {
        this.listBook = listBook;
    }
    private String name;
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
