package week7.LCS;

import java.util.List;
import java.util.Optional;

public class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog(List<Book> books) {
        this.books = books;
    }

    public Optional<Book> checkAvailabilityByTitle(String title) {
        return books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst();
    }

    public Optional<Book> getFirstAvailableBookByAuthor(String author) {
        return books.stream()
                .filter(book -> book.author().equalsIgnoreCase(author) && book.availability())
                .findFirst();
    }

    public void updateAvailabilityStatus(String title, boolean availability) {
        books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst()
                .ifPresent(book -> book = book.withAvailability(availability));
    }
}

