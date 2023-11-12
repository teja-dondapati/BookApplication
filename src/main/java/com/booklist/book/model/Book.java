package com.booklist.book.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotBlank;

@Document(collection = "bookapp") // Specify the MongoDB collection name
public class Book {
    @Id
    private String id;

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @NotBlank
    private String description;

    // Constructors

    public Book() {
        // Default constructor
    }

    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString method (optional, but useful for debugging)

    @Override
    public String toString() {
        return String.format(
                "Book[id=%s, title='%s', author='%s', description='%s']",
                id, title, author, description);
    }
}
