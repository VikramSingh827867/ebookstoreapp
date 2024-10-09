package com.mphasis.ebookstoreapp.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.ebookstoreapp.Entity.Book;
import com.mphasis.ebookstoreapp.Repository.BookStoreRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookStoreService {

    @Autowired
    private BookStoreRepository bookStoreRepository;

   
    public Book addBook(Book book) {
        return bookStoreRepository.save(book);
    }

   
    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookStoreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setIsbn(bookDetails.getIsbn());
        book.setPages(bookDetails.getPages());
        book.setpublicationYear(bookDetails.getpublicationYear());
        book.setPublisher(bookDetails.getPublisher());
        
        return bookStoreRepository.save(book);
    }

    
    public List<Book> findAllBooks() {
        return bookStoreRepository.findAll();
    }

   
    public Optional<Book> findBookById(Long id) {
        return bookStoreRepository.findById(id);
    }

   
    public void deleteBookById(Long id) {
        bookStoreRepository.deleteById(id);
    }

    
    public List<Book> findBooksByTitle(String title) {
        return bookStoreRepository.findByTitle(title);
    }

    public List<Book> findBooksByPublisher(String publisher) {
        return bookStoreRepository.findByPublisherContaining(publisher);
    }

    public List<Book> getBookBypublicationYear(int publishYear) 
    { 
        return bookStoreRepository.findBypublicationYear(publishYear);
    }
}
