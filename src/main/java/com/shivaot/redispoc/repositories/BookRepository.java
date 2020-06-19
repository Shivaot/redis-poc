package com.shivaot.redispoc.repositories;

import com.shivaot.redispoc.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,String> {
}
