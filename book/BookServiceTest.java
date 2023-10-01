package seminars.fourth.book;


import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    BookRepository bookRepository = mock(BookRepository.class);
    @Test
    public void getBook(){
        BookService bookService = new BookService(bookRepository);

        when(bookRepository.findById("1")).thenReturn(new Book("1","Book1","Author1"));

        Book book = bookService.findBookById("1");
        assertEquals("Book1", book.getTitle());
        assertEquals("Author1",book.getAuthor());

        verify(bookRepository, times(1)).findById("1");
    }

    @Test
    public void getBookAll(){
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findAll()).thenReturn(Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        ));

        List<Book> books = bookService.findAllBooks();
        assertEquals(2,books.size());
        assertEquals("Book1", books.get(0).getTitle());
        assertEquals("Author1", books.get(0).getAuthor());
        assertEquals("Book2", books.get(1).getTitle());
        assertEquals("Author2", books.get(1).getAuthor());

        verify(bookRepository, times(1)).findAll();


    }

}