package ThanhPhuong.output1.service.impl;

import ThanhPhuong.output1.models.Author;
import ThanhPhuong.output1.repository.AuthorRepository;
import ThanhPhuong.output1.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }
}
