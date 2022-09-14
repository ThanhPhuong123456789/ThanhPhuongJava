package ThanhPhuong.output1.service.impl;

import ThanhPhuong.output1.models.Author;
import ThanhPhuong.output1.models.Book;
import ThanhPhuong.output1.models.BookDTO;
import ThanhPhuong.output1.repository.AuthorRepository;
import ThanhPhuong.output1.repository.BookRepository;
import ThanhPhuong.output1.repository.LibraryRepository;
import ThanhPhuong.output1.service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private LibraryRepository libraryRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Book addBook(BookDTO book) {
        Book bookEntity = new Book();
        BeanUtils.copyProperties(book, bookEntity);
        bookEntity.setLibrary(libraryRepository.findById(book.getLibraryId()));
        List<Author> list = new ArrayList<>();
        for (int id : book.getAuthorId()) {
            Author author = authorRepository.findById(id);
            list.add(author);
        }
        bookEntity.setAuthors(list);
        return bookRepository.save(bookEntity);

    }

    @Override
    public Book updateBook(BookDTO book) {
        if (book != null) {
            if (bookRepository.findById(book.id).isPresent()) {
                Book bookEntity = new Book();
                BeanUtils.copyProperties(book, bookEntity);
                bookEntity.setLibrary(libraryRepository.findById(book.getLibraryId()));
                List<Author> list = new ArrayList<>();
                for (int id : book.getAuthorId()) {
                    Author author = authorRepository.findById(id);
                    list.add(author);

                }
                bookEntity.setAuthors(list);
                return bookRepository.save(bookEntity);
            }
        }
        return null;
    }

    @Override
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }


    @Override
    public Optional<Book> getOneBook(Book book) {

        return bookRepository.findById(book.getId());
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getAllByName(String name) {
        return bookRepository.findByNameContains(name);
    }

    @Override
    public List<Book> getAllBypublisher(String publisher) {
        return bookRepository.findByPublisherContains(publisher);
    }


    /* Tạo ra một hàm
    private String changeSearchValue(String name){
        return "%" + name + "%";
    }
     */
    public List<Book> editPriceByPublisher(String publisher, String price) {
        List<Book> ls = getAllBypublisher(publisher);
        for (Book book : ls) {
            book.setPrice(price);
        }
        ls = bookRepository.saveAll(ls);
        return ls;
    }
}
