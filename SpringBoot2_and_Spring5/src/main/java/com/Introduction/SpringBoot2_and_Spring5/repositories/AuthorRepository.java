package com.Introduction.SpringBoot2_and_Spring5.repositories;

import org.springframework.data.repository.CrudRepository;

import com.Introduction.SpringBoot2_and_Spring5.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
