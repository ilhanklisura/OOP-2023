package week7.LCS;

public record Book(String title, String author, int publicationYear, boolean availability) {
    public Book withAvailability(boolean availability) {
        return new Book(this.title(), this.author(), this.publicationYear(), availability);
    }
}


