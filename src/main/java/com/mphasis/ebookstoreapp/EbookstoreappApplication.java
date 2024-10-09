package com.mphasis.ebookstoreapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.mphasis.ebookstoreapp.Entity.Book;
import com.mphasis.ebookstoreapp.Repository.BookStoreRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class EbookstoreappApplication implements CommandLineRunner {
	
	@Autowired
	BookStoreRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(EbookstoreappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		bookRepository.save(new Book("Clean Code", "Robert C. Martin", "978-0-13-608323-8", 464, 2008, "Prentice Hall"));
		bookRepository.save(new Book("The Pragmatic Programmer", "Andrew Hunt, David Thomas", "978-0-201-61622-4", 352, 1999, "Addison-Wesley"));
		bookRepository.save(new Book("Design Patterns", "Erich Gamma et al.", "978-0-201-63361-0", 395, 1994, "Addison-Wesley"));
		bookRepository.save(new Book("Artificial Intelligence: A Modern Approach", "Stuart Russell, Peter Norvig", "978-0-13-461099-6", 1132, 2010, "Prentice Hall"));
		bookRepository.save(new Book("You Don't Know JS (Book Series)", "Kyle Simpson", "978-1-59327-950-9", 278, 2014, "O'Reilly Media"));
		bookRepository.save(new Book("Introduction to the Theory of Computation", "Michael Sipser", "978-0-534-94728-8", 432, 1997, "Thomson Learning"));
		bookRepository.save(new Book("The Art of Computer Programming", "Donald E. Knuth", "978-0-201-89683-1", 3168, 1997, "Addison-Wesley"));
		bookRepository.save(new Book("Code Complete", "Steve McConnell", "978-0-7356-1967-8", 960, 2004, "Microsoft Press"));
		bookRepository.save(new Book("Head First Java", "Kathy Sierra, Bert Bates", "978-0-596-00714-5", 688, 2003, "O'Reilly Media"));
		bookRepository.save(new Book("Patterns of Enterprise Application Architecture", "Martin Fowler", "978-0-321-11215-0", 464, 2002, "Addison-Wesley"));
		bookRepository.save(new Book("Learning Python", "Mark Lutz", "978-1-4493-5591-0", 1648, 2013, "O'Reilly Media"));
		bookRepository.save(new Book("Computer Networking: A Top-Down Approach", "James Kurose, Keith Ross", "978-0-13-665262-3", 720, 2017, "Pearson"));
		bookRepository.save(new Book("SQL Performance Explained", "Markus Winand", "978-1-4919-3430-4", 284, 2012, "Addison-Wesley"));
		bookRepository.save(new Book("Java Concurrency in Practice", "Brian Goetz et al.", "978-0-321-34960-0", 432, 2006, "Addison-Wesley"));
		bookRepository.save(new Book("The Mythical Man-Month", "Frederick P. Brooks Jr.", "978-0-201-00650-9", 322, 1995, "Addison-Wesley"));
		bookRepository.save(new Book("The Clean Coder", "Robert C. Martin", "978-0-321-63568-0", 464, 2011, "Prentice Hall"));
		bookRepository.save(new Book("Python Crash Course", "Eric Matthes", "978-1-59327-928-4", 544, 2015, "No Starch Press"));
		bookRepository.save(new Book("Introduction to Machine Learning", "Ethem Alpaydin", "978-0-262-51170-4", 416, 2014, "MIT Press"));
		bookRepository.save(new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", "978-0-982414-2-0", 704, 2015, "CareerMonk Publications"));
		bookRepository.save(new Book("Head First Design Patterns", "Eric Freeman et al.", "978-0-596-00712-5", 688, 2004, "O'Reilly Media"));
		bookRepository.save(new Book("The Phoenix Project", "Gene Kim et al.", "978-0-9847488-0-2", 432, 2013, "IT Revolution Publishing"));
		bookRepository.save(new Book("Effective Java", "Joshua Bloch", "978-0-321-35668-0", 416, 2018, "Addison-Wesley"));
		bookRepository.save(new Book("Algorithms Unlocked", "Thomas H. Cormen", "978-0-984-60062-3", 296, 2013, "MIT Press"));
		bookRepository.save(new Book("Structure and Interpretation of Computer Programs", "Harold Abelson, Gerald Jay Sussman", "978-0-262-51087-5", 657, 1996, "MIT Press"));
		bookRepository.save(new Book("Modern Operating Systems", "Andrew S. Tanenbaum", "978-0-13-600663-3", 944, 2015, "Pearson"));
		bookRepository.save(new Book("Programming in Haskell", "Graham Hutton", "978-1-4398-0785-2", 300, 2007, "Cambridge University Press"));
		bookRepository.save(new Book("The C Programming Language", "Brian W. Kernighan, Dennis M. Ritchie", "978-0-13-110362-7", 272, 1988, "Prentice Hall"));
		bookRepository.save(new Book("Computer Graphics: Principles and Practice", "John F. Hughes et al.", "978-0-321-55383-8", 1152, 2010, "Addison-Wesley"));
		bookRepository.save(new Book("Data Structures and Algorithms Made Easy", "Narasimha Karumanchi", "978-93-5100-507-9", 342, 2011, "CareerMonk Publications"));
		bookRepository.save(new Book("Programming Pearls", "Jon Bentley", "978-0-321-38871-2", 272, 2009, "Addison-Wesley"));
		bookRepository.save(new Book("Operating System Concepts", "Abraham Silberschatz et al.", "978-1-118-04710-0", 960, 2018, "Wiley"));
		bookRepository.save(new Book("Computer Architecture: A Quantitative Approach", "John L. Hennessy, David A. Patterson", "978-0-07-339066-3", 1040, 2011, "McGraw-Hill"));
		bookRepository.save(new Book("Elements of Programming Interviews", "Adnan Aziz, Tsung-Hsien Lee, Amit Prakash", "978-1-4919-5111-0", 250, 2015, "EPI"));
		bookRepository.save(new Book("Software Engineering at Google", "Titus Winters et al.", "978-1-4919-2412-1", 320, 2020, "O'Reilly Media"));
		bookRepository.save(new Book("Deep Learning", "Ian Goodfellow et al.", "978-0-262-03561-3", 775, 2016, "MIT Press"));
		bookRepository.save(new Book("Reinforcement Learning: An Introduction", "Richard S. Sutton, Andrew G. Barto", "978-0-262-53562-8", 552, 2018, "MIT Press"));
		bookRepository.save(new Book("The Algorithm Design Manual", "Steven Skiena", "978-3-540-69850-7", 712, 2009, "Springer"));
		bookRepository.save(new Book("Web Design with HTML, CSS, JavaScript and JQuery", "Jon Duckett", "978-1-118-00741-5", 720, 2014, "Wiley"));
		bookRepository.save(new Book("Python for Data Analysis", "Wes McKinney", "978-1-4493-7138-4", 548, 2017, "O'Reilly Media"));
		bookRepository.save(new Book("Understanding Machine Learning: From Theory to Algorithms", "Shai Shalev-Shwartz, Shai Ben-David", "978-1-4419-0639-9", 350, 2014, "Cambridge University Press"));
		bookRepository.save(new Book("Learning SQL", "Alan Beaulieu", "978-1-4493-0482-5", 360, 2016, "O'Reilly Media"));
		bookRepository.save(new Book("Web Development with Node and Express", "Ethan Brown", "978-1-4919-1157-1", 224, 2015, "O'Reilly Media"));
		bookRepository.save(new Book("Functional Programming in Scala", "Paul Chiusano, Rúnar Bjarnason", "978-1-4493-7341-4", 312, 2014, "Manning Publications"));
		bookRepository.save(new Book("Software Engineering: A Practitioner's Approach", "Roger S. Pressman", "978-0-07-337597-1", 960, 2014, "McGraw-Hill"));
		bookRepository.save(new Book("Network Programming in Python", "John Goerzen", "978-1-59327-157-9", 356, 2004, "No Starch Press"));
		
	}

}
