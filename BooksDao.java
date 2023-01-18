package com.heartcore.BookStore.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heartcore.BookStore.model.Books;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface BooksDao extends JpaRepository<Books, String>{

}
