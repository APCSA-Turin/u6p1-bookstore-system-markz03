package com.example.project;

public class User{
    // 3 instance variables - String name, String Id, and Book[] book intialized to a length of 5
    private String name, Id;
    private Book[] book = new Book[5];

    // 2-parameter User constructor, name and Id
    public User(String name, String Id) {
        this.name = name;
        this.Id = Id;
    }

    // returns the name of the user object
    public String getName() {
        return name;
    }

    // sets the name of the user object to newName
    public void setName(String newName) {
        name = newName;
    }

    // returns the Id of the user object
    public String getId() {
        return Id;
    }

    // sets the Id of the user object to newName
    public void setId(String newId) {
        Id = newId;
    }

    // returns the book array
    public Book[] getBooks() {
        return book;
    }

    // sets the book array to newBook
    public void setBooks(Book[] newBook) {
        book = newBook;
    }

    // returns a list of book information, empty if none
    public String bookListInfo() {
        String str = "Books: \n";
        for (int i = 0; i < book.length; i++) {
            // checks if books[i] is empty 
            if (book[i] == null) {
                str += "empty";
            }
            // if the book[i] isn't empty, str takes in the info of the book
            else {
                str += book[i].bookInfo();
            }
            str += "\n";
        }
        return str;
        
    } 

    // returns "Name: [], Id: [], Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
    public String userInfo(){
        return "Name: " + name + "\nId: " + Id + "\n" + bookListInfo();
    }
       
}