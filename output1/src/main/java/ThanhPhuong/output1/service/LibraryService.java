package ThanhPhuong.output1.service;

import ThanhPhuong.output1.models.Book;
import ThanhPhuong.output1.models.BookDTO;
import ThanhPhuong.output1.models.Library;
import ThanhPhuong.output1.models.LibraryDTO;
import ThanhPhuong.output1.models.LibraryModel;

import java.util.List;
import java.util.Optional;

public interface LibraryService {
    List<Library> getAllLibrary();
    //Add
    Library addLibrary(LibraryDTO libraryDTO);
    //update
    Library updateLibrary(LibraryDTO libraryDTO);
    //delete
    Library deleteLibrary(LibraryDTO libraryDTO);
    Library getById(int id);


}
