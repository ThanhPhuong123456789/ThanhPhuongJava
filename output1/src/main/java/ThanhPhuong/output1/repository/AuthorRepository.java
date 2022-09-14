package ThanhPhuong.output1.repository;

import ThanhPhuong.output1.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
    Author findById(int id);
}
