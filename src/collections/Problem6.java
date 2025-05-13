

//Problem 6: Library Catalog (Map<String, Set<Book>>)
//Each genre maps to a set of Book objects.
//• Prevent duplicate books using equals and hashCode.
//• Print all books in a genre, sorted by publication year.


package collections;
import  java.util.*;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }



    public void printBook() {
        System.out.println(year + " - \"" + title + "\" by " + author);
    }


}
public class Problem6 {
    public static void main(String[] args) {

        Map<String, Set<Book>> library = new HashMap<>();

        addBook(library, "Historical Fiction", new Book("Train to Pakistan", "Khushwant Singh", 1956));
        addBook(library, "Literary Fiction", new Book("The God of Small Things", "Arundhati Roy", 1997));
        addBook(library, "Literary Fiction", new Book("A Suitable Boy", "Vikram Seth", 1993));
        addBook(library, "Mythological Fiction", new Book("The Immortals of Meluha", "Amish Tripathi", 2010));
        addBook(library, "Mythological Fiction", new Book("Palace of Illusions", "Chitra Banerjee Divakaruni", 2008));
        addBook(library, "Thriller", new Book("The White Tiger", "Aravind Adiga", 2008));
        addBook(library, "Fantasy", new Book("Karna's Wife", "Kavita Kane", 2013));
        addBook(library, "Drama", new Book("Five Point Someone", "Chetan Bhagat", 2004));
        addBook(library, "Drama", new Book("The Zoya Factor", "Anuja Chauhan", 2008));


        printBooksByGenre(library);
    }

    // add a book to the correct genre set
    private static void addBook(Map<String, Set<Book>> library, String genre, Book book) {
        library.computeIfAbsent(genre, k -> new HashSet<>()).add(book);
    }


    // prints all books in each genre sorted by year
    private static void printBooksByGenre(Map<String, Set<Book>> library) {
        for (String genre : library.keySet()) {
            System.out.println("\nGenre: " + genre);
            Set<Book> books = library.get(genre);

            books.stream()
                    .sorted(Comparator.comparingInt(Book::getYear))
                    .forEach(Book::printBook);
        }
    }
}
