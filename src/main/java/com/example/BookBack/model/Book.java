package com.example.BookBack.model;


public class Book {
    private int Id;
    private String Title;
    private String Author;
    private int Pages;

    public int getId(){
        return Id;
    }

    public void setId(int Id){
        this.Id = Id;
    }

    public String getTitle(){
        return Title;
    }

    public void setTitle(String Title){
        this.Title = Title;
    }

    public String getAuthor(){
        return Author;
    }

    public void setAuthor(String Author){
        this.Author = Author;
    }

    public int getPages(){
        return Pages;
    }

    public void setPages(int Pages){
        this.Pages = Pages;
    }

    @Override
    public String toString(){
        return "Book's id is " + Id +
                " title is " + Title +
                " author is " + Author +
                " pages " + Pages;
    }


}
