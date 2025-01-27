package com.example.project;

public class Book{
    //Instance variables - String title, String author, int yearPublished, String isbn, int quantity
    private String title, author, isbn;
    private int yearPublished, quantity;

    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    // returns the title of the book object
    public String getTitle() {
        return title;
    }
    
    // sets the title of the book object to newTitle
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    // returns the author of the book object
    public String getAuthor() {
        return author;
    }

    // sets the author of the book object to newAuthor
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    // returns the year the book object was published
    public int getYearPublished() {
        return yearPublished;
    }

    // sets the yearPublished of the book object to newYearPublished
    public void setYearPublished(int newYearPublished) {
        yearPublished = newYearPublished;
    }

    // returns the ISBN of the book object
    public String getIsbn() {
        return isbn;
    }

    // sets the ISBN of the book object to newISBN
    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    // returns the quantity of the book object
    public int getQuantity() {
        return quantity;
    }

    // sets the quantity of the book object to newQuantity
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    // returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
    public String bookInfo(){
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    } 
       
}