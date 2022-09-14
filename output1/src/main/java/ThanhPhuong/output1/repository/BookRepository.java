package ThanhPhuong.output1.repository;

import ThanhPhuong.output1.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByNameContains(String name);
    List<Book> findByPublisherContains(String publisher);
}
