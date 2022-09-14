package ThanhPhuong.output1.service.impl;

import ThanhPhuong.output1.models.Author;
import ThanhPhuong.output1.models.Book;
import ThanhPhuong.output1.models.Librarian;
import ThanhPhuong.output1.models.Library;
import ThanhPhuong.output1.models.LibraryDTO;
import ThanhPhuong.output1.repository.BookRepository;
import ThanhPhuong.output1.repository.LibrarianRepository;
import ThanhPhuong.output1.repository.LibraryRepository;
import ThanhPhuong.output1.service.LibraryService;
import antlr.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;
    @Autowired
    private LibrarianRepository librarianRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Library> getAllLibrary() {
        return libraryRepository.findAll();
    }

    @Override
    public Library addLibrary(LibraryDTO libraryDTO) {
        Library libraryEntity = new Library();
        BeanUtils.copyProperties(libraryDTO, libraryEntity);
        libraryEntity.setLibrarian(librarianRepository.findById(libraryDTO.getLibrarianId()).orElse(null));
        Set<Book> list = new HashSet<>();
        for (int id : libraryDTO.getBookId()) {
            Optional<Book> book = bookRepository.findById(id);
            if (book.isPresent()) {
                list.add(book.get());
            }

        }
        //list Librarian
        libraryEntity.setListBook(list);
        return libraryRepository.save(libraryEntity);
    }


    @Override
    public Library updateLibrary(LibraryDTO libraryDTO) {

        if (libraryDTO != null) {
            if (!ObjectUtils.isEmpty(libraryRepository.findById(libraryDTO.id))) { //!ObjectUtils.isEmpty dung de kiem tra null
                Library libraryEntity = new Library();
                BeanUtils.copyProperties(libraryDTO, libraryEntity);
                libraryEntity.setLibrarian(librarianRepository.findById(libraryDTO.getLibrarianId()).orElse(null));
                Set<Book> list = new HashSet<>();
                for (int id : libraryDTO.getBookId()) {
                    Optional<Book> book = bookRepository.findById(id);
                    if (book.isPresent()) {
                        list.add(book.get());
                    }
                    libraryEntity.setListBook(list);
                    return libraryRepository.save(libraryEntity);
                }
            }
        }
        return null;
    }

    @Override
    public Library deleteLibrary(LibraryDTO libraryDTO) {
        return null;
    }

    @Override
    public Library getById(int id) {

        return null;
    }


}




