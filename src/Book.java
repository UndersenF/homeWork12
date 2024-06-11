public class Book {
    private String nameOfBook;
    private final Author author;
    private int publishingYear;

    public Book (String nameOfBook, Author author, int publishingYear) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;

    }
}
