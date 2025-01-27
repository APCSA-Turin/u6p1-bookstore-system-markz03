package com.example.project;

public class BookStore{

    // 2 instance variables - Book[] books initalized to a length of 5 and User[] users initalized to a length of 10
    public Book[] books = new Book[5];
    public User[] users = new User[10];

    // empty BookStore constructor
    public BookStore() {}

    // returns the array users
    public User[] getUsers() {
        return users;
    }

    // sets the array user to the parameter array newUsers
    public void setUsers(User[] newUsers){
        users = newUsers;
    }

    // returns the array books
    public Book[] getBooks() {
        return books;
    }

    // adds a new user to the users array
    public void addUser(User user) {
        int userIdx = 0;
        // finds the next empty index for user
        while (users[userIdx] != null && userIdx < users.length) {
            userIdx++;
        }
        // only adds users if spot available
        if (users[userIdx] == null) {
            users[userIdx] = user;            
        }


    } 

    // removes an object user from the array users and consolidates the array
    public void removeUser(User user) {
        // loops through users and sets users[i] to null if user is found in the array
        for (int i = 0; i < users.length; i++) {
            if (users[i] == user) {
                users[i] = null;
            }
        }
        // consolidates the users array at the end
        consolidateUsers();
    }

    // consolidates the users array
    public void consolidateUsers() {
        for (int i = 0; i < users.length; i++) {
            // checks if users at index i is null
            if (users[i] == null) {
                for (int j = i; j < users.length; j++) {
                    // shifts all elements right of an null left by 1
                    if (users[j] != null) {
                        users[i] = users[j];
                        users[j] = null;
                        j = users.length;
                    }
                }
            }
        }
    }

    // adds a new book to the books array
    public void addBook(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                i = books.length;
            }
        }
    }

    // inserts a book in the books array at index
    public void insertBook(Book book, int index){
        // loops through the books length in reverse and shifts all elements to the right if there is a null
        for (int i = books.length - 1; i > index; i--) {
            if (books[i] == null) {
                books[i] = books[i - 1];
                books[i - 1] = null;
            }
        }
        // sets the null (found at the index for the book to be inserted) to book
        books[index] = book;
    
    }

    // removes a quantity of book in the books array and shrinks the size of books if necessary
    public void removeBook(Book book){
        // loops through the books array
        for (int i = 0; i < books.length; i++) {
            // if book at index i is equal to book and if its quantity is greater than 1, decrease the quantity of book at index i
            if (books[i] == book && books[i].getQuantity() > 1) {
                int origQuantity = books[i].getQuantity();
                books[i].setQuantity(origQuantity - 1);
            }
            // if book at index i is equal to book and its quantity is 1
            else if (books[i] == book && books[i].getQuantity() == 1){
                // creates a temporary books Array with the same books as the books array excluding the book with 1 quantity
                Book[] tempBooks = new Book[books.length - 1];
                int idx = 0;
                for (int j = 0; j < books.length; j++) {
                    if (books[j] != book) {
                        tempBooks[idx] = books[j];
                        idx++;
                    }
                }
                // decreases the length of the book array by 1 and copies over each element in tempBooks
                books = new Book[tempBooks.length];
                for (int k = 0; k < books.length; k++) {
                    books[k] = tempBooks[k];
                }
            }
        }

        
    }
       
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}