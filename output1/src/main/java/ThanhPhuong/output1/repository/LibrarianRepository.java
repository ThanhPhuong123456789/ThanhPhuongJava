package ThanhPhuong.output1.repository;

import ThanhPhuong.output1.models.Author;
import ThanhPhuong.output1.models.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Integer>  {

}
