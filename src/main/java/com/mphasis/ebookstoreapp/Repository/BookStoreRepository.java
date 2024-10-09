package com.mphasis.ebookstoreapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.ebookstoreapp.Entity.Book;

import java.util.List;

@Repository
public interface BookStoreRepository extends JpaRepository<Book, Long> {
    
    List<Book> findByTitle(String title);
    List<Book> findByPublisherContaining(String publisher); 
    List<Book> findBypublicationYear(int publicationYear);
	
}
