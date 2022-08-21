package com.pasanyasara.spring5webapp.bootstrap;

import com.pasanyasara.spring5webapp.domain.Author;
import com.pasanyasara.spring5webapp.domain.Book;
import com.pasanyasara.spring5webapp.repository.AuthorRepository;
import com.pasanyasara.spring5webapp.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric","evans");
        Book ddd = new Book("Domain","34234");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

    }
}
