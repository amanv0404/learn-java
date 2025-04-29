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

        addBook(library, "Science Fiction", new Book("Dune", "Frank Herbert", 1965));
        addBook(library, "Science Fiction", new Book("Neuromancer", "William Gibson", 1984));
        addBook(library, "Science Fiction", new Book("Foundation", "Isaac Asimov", 1951));
        addBook(library, "Fantasy", new Book("The Hobbit", "J.R.R. Tolkien", 1937));
        addBook(library, "Fantasy", new Book("The Name of the Wind", "Patrick Rothfuss", 2007));
        addBook(library, "Fantasy", new Book("A Game of Thrones", "George R.R. Martin", 1996));
        addBook(library, "Mystery", new Book("Gone Girl", "Gillian Flynn", 2012));
        addBook(library, "Mystery", new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", 2005));
        addBook(library, "Mystery", new Book("The Hound of the Baskervilles", "Arthur Conan Doyle", 1902));

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
