package com.example.BookBack.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;
    private int pages;

    @Column(name = "image_url")
    private String imageUrl;

    public Book(){

    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString(){
        return "Book's id is " + id +
                " title is " + title +
                " author is " + author +
                " pages " + pages;
    }


}
