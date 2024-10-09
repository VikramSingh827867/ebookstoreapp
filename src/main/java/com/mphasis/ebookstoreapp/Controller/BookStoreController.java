package com.mphasis.ebookstoreapp.Controller;
import java.util.List;

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

import com.mphasis.ebookstoreapp.Entity.Book;
import com.mphasis.ebookstoreapp.Service.BookStoreService;

@RestController
@RequestMapping("/books")
public class BookStoreController {

    @Autowired
    private BookStoreService bookStoreService;

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookStoreService.addBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        return bookStoreService.updateBook(id, bookDetails);
    }

    @GetMapping
    public List<Book> findAllBooks() {
        return bookStoreService.findAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findBookById(@PathVariable Long id) {
        return bookStoreService.findBookById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id) {
        bookStoreService.deleteBookById(id);
    }

    @GetMapping("/search/title")
    public List<Book> findBooksByTitle(@RequestParam String title) {
        return bookStoreService.findBooksByTitle(title);
    }

    @GetMapping("/search/publisher")
    public List<Book> findBooksByPublisher(@RequestParam String publisher) {
        return bookStoreService.findBooksByPublisher(publisher);
    }

    @GetMapping("/search/publicationYear")
    public List<Book> findBooksBypublicationYear(@RequestParam int publicationYear) {
        return bookStoreService.getBookBypublicationYear(publicationYear);
    }
}
