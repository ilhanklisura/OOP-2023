package week7;

import week7.librarycatalogsystem.Book;
import week7.librarycatalogsystem.LibraryCatalog;

import java.util.Arrays;

public class MainLibraryCatalog {
    public static void main(String[] args) {
        LibraryCatalog libraryCatalog = new LibraryCatalog(Arrays.asList(
                new Book("Book1", "Author1", 2000, true),
                new Book("Book2", "Author2", 2010, false),
                new Book("Book3", "Author1", 2020, true)
        ));

        libraryCatalog.checkAvailabilityByTitle("Book1").ifPresent(System.out::println);

        libraryCatalog.getFirstAvailableBookByAuthor("Author1").ifPresent(System.out::println);

        libraryCatalog.updateAvailabilityStatus("Book2", true);

        libraryCatalog.checkAvailabilityByTitle("Book2").ifPresent(System.out::println);
    }
}

