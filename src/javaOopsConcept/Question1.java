
//1. Book Library (Class & Object)
//Create a `Book` class with fields `title`, `author`, and `ISBN`. Include a constructor and a method to
//print details. Then, create a `Library` class to store a list of books and a method to search for a book
//by title.

package javaOopsConcept;
import java.util.ArrayList;

class Book{
    String title;
    String author;
    String isbn;
    static int totalNumberOfBooks = 0;

    Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    void bookDetail(){
        System.out.println("ISBN: "+isbn);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println();
        totalNumberOfBooks++;
    }


    int getTotalNumberOfBooks(){
        return totalNumberOfBooks;
    }
}

class Library {
    ArrayList<Book> books;

    Library(){
        books = new ArrayList<>();
    }

    void addBook(Book book){
        books.add(book);
    }

    void removeBook(Book book){
        books.remove(book);
    }

    ArrayList<Book> getBooks(){
        return books;
    }

}


public class Question1 {
    public static void main(String[] args) {
        Book b1 = new Book("1","Do Epic Shit","Ankur Wariko");
        Book b2 = new Book("2","Odyssey","Homer");
        Book b3 = new Book("3","Animal Farm","George Orwell");

        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("All Books");

        for(Book book :library.getBooks()){
            book.bookDetail();
        }

    }
}
