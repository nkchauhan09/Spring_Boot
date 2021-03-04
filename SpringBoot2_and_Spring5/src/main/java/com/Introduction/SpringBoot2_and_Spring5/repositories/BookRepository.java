package com.Introduction.SpringBoot2_and_Spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.Introduction.SpringBoot2_and_Spring5.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
