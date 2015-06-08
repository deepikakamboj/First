package controller;

import lombok.NoArgsConstructor;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.BookService;

@NoArgsConstructor
@Controller
@RequestMapping("/")
public class BookController {

    private BookService service;

    @Autowired
    public BookController(BookService service) {
      this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "welcome";
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addBook(@RequestBody Book book) {
       service.add(book);
        return new ResponseEntity<Book>(HttpStatus.CREATED);
    }
}
