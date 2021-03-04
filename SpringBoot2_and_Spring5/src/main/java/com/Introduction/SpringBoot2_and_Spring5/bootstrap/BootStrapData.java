package com.Introduction.SpringBoot2_and_Spring5.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.Introduction.SpringBoot2_and_Spring5.domain.Author;
import com.Introduction.SpringBoot2_and_Spring5.domain.Book;
import com.Introduction.SpringBoot2_and_Spring5.domain.Publisher;
import com.Introduction.SpringBoot2_and_Spring5.repositories.AuthorRepository;
import com.Introduction.SpringBoot2_and_Spring5.repositories.BookRepository;
import com.Introduction.SpringBoot2_and_Spring5.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}




	@Override
	public void run(String... args) throws Exception {

		System.out.println("Started in BootStrap");
		
		Publisher publisher = new Publisher();
		publisher.setName("SFG Publishing");
		publisher.setCity("st Petersburg");
		publisher.setState("FL");
		
		publisherRepository.save(publisher);
		
		System.out.println("Publisher Count : " + publisherRepository.count());
		
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "123123");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		ddd.setPublisher(publisher);
		publisher.getBooks().add(ddd);
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		publisherRepository.save(publisher);
		
		Author rod = new Author("Rod", "Jhonson");
		Book noEJB = new Book("J2EE Development without EJB", "124124");
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		noEJB.setPublisher(publisher);
		publisher.getBooks().add(noEJB);
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		publisherRepository.save(publisher);
		
		System.out.println("Number of Books : " + bookRepository.count());
		System.out.println("Publisher Number of Books : " + publisher.getBooks().size());
	}
	
	

}
