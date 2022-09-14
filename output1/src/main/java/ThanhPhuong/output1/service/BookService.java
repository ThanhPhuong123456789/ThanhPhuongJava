package ThanhPhuong.output1.service;

import ThanhPhuong.output1.models.Book;
import ThanhPhuong.output1.models.BookDTO;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Book addBook(BookDTO book);

    //update a book
    Book updateBook(BookDTO book);

    //delete a
    void deleteBook(int id);

    //Ham lay ra mot book
    Optional<Book> getOneBook(Book book);

    List<Book> getAllBook();
    List<Book> getAllByName(String name);
    List<Book> getAllBypublisher(String publisher);
    List<Book> editPriceByPublisher(String publisher, String price);
}
