package ThanhPhuong.output1.controllers;


import ThanhPhuong.output1.models.Book;
import ThanhPhuong.output1.models.BookDTO;
import ThanhPhuong.output1.models.Librarian;
import ThanhPhuong.output1.models.Library;
import ThanhPhuong.output1.models.LibraryDTO;
import ThanhPhuong.output1.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;

    @GetMapping("/libraryy")
    public ResponseEntity getAllLibrary() {
        List<Library> allLibrary = libraryService.getAllLibrary();
        return ResponseEntity.ok(allLibrary);
    }
    @GetMapping("/")

    public ResponseEntity getLibraryId(@RequestParam int id)
    {
        Library library = libraryService.getById(id);
       return ResponseEntity.ok(library);
    }
    @GetMapping("/LibraryAdd")
    public Library addLibrary(@RequestBody LibraryDTO libraryDTO) {
        return libraryService.addLibrary(libraryDTO);
    }
    @PutMapping("/updateLibrary")
    public Library updateLibrary(@RequestParam("id") int id, @RequestBody LibraryDTO libraryDTO)
    {
        return libraryService.updateLibrary(libraryDTO);

    }
}
