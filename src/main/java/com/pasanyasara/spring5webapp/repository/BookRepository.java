package com.pasanyasara.spring5webapp.repository;

import com.pasanyasara.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
