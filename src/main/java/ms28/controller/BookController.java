package ms28.controller;

import lombok.RequiredArgsConstructor;
import ms28.model.Book;
import ms28.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/save")
public class BookController {
    private final BookService bookService;
    @GetMapping(value = "/{id}")
    public Book getBook(@PathVariable Long id){
        return bookService.getBook(id);

    }
}
