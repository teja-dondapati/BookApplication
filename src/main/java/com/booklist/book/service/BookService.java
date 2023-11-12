package com.booklist.book.service;

import com.booklist.book.model.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    ResponseEntity<Book> getBookById(String id);
    ResponseEntity<Book> createBook(Book book);
    ResponseEntity<Book> updateBook(String id, Book book);
    ResponseEntity<Void> deleteBook(String id);
}