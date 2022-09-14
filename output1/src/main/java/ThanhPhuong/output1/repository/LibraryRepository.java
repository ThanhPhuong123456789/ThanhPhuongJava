package ThanhPhuong.output1.repository;

import ThanhPhuong.output1.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Integer> {
    Library findById(int id);

}
