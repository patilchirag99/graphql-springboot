package com.chirag.springgraphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chirag.springgraphql.entity.Books;

public interface BookRepo extends JpaRepository<Books, Integer>{

}
