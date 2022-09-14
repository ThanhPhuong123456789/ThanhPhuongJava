package ThanhPhuong.output1.controllers;


import ThanhPhuong.output1.models.Book;
import ThanhPhuong.output1.models.BookDTO;
import ThanhPhuong.output1.service.BookService;
import ThanhPhuong.output1.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping(path="/api")
public class BookController {
    @Autowired
    private BookService bookservice;

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/book")
    public ResponseEntity<List<Book>> getAllBook() {

        List<Book> allBooks = bookservice.getAllBook();
        return ResponseEntity.ok(allBooks);
    }
    @PostMapping("/addbook")
    public Book addBook(@RequestBody BookDTO book) {
        return bookservice.addBook(book);
    }

    @PutMapping("/book")
    public Book updateBook(@RequestParam("id") int id, @RequestBody BookDTO bookDTO) {
        return bookservice.updateBook(bookDTO);
    }

    @DeleteMapping ("/delete/{id}")
    public void deleteBook(@PathVariable("id") int id) {
        bookservice.deleteBook(id);
    }
    @GetMapping("/bookByName")
    public ResponseEntity<List<Book>> getAllByName(@RequestParam ("name") String name)
    {
        List<Book> allBooks = bookservice.getAllByName(name);
        return ResponseEntity.ok(allBooks);
    }
    /*@PutMapping("/SetPrice")
    public ResponseEntity<List<Book>> editPriceByPublisher(@RequestParam ("publisher") String publisher, @RequestParam ("price") String price)
    {
        return editPriceByPublisher(publisher,price);
    }*/

    @PutMapping("/EditPrice")
    public List<Book> editPrice(@RequestParam ("publisher") String publisher, @RequestParam ("price") String price)
    {
        List<Book> listPrice = bookservice.editPriceByPublisher(publisher, price);
        return listPrice;
    }
}
