package ThanhPhuong.output1.controllers;

import ThanhPhuong.output1.models.Author;
import ThanhPhuong.output1.models.Book;
import ThanhPhuong.output1.service.AuthorService;
import ThanhPhuong.output1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class AuthorController {
    @Autowired
    private AuthorService authorservice;
    @GetMapping("/author")
    public ResponseEntity getAllAuthor() {

        List<Author> allAuthor = authorservice.getAllAuthor();
        return ResponseEntity.ok(allAuthor);
    }
}