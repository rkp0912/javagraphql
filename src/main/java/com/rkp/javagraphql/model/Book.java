package com.rkp.javagraphql.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("books")
public class Book {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book() {
    }

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    @Id
    private int id;
    private String name;
    private int pages;
}
