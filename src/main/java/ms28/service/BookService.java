package ms28.service;

import ms28.model.Book;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {
    private static long ID = 1L;
    private static Map<Long, Book> bookMap = new HashMap<>();

    public Book getBook(Long id) {
        return Book.builder()
                .author("Harry Potter")
                .title("J.K.Rowling")
                .id(ID++)
                .build();


    }
}
