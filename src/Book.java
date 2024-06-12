public class Book {
    private String nameOfBook;
    private final Author author;
    private int publishingYear;

    public Book(String nameOfBook, Author author, int publishingYear) {
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
        if (publishingYear < this.publishingYear && publishingYear >= 0){
            throw new IllegalArgumentException("Новых публикаций из прошлого быть не может!");
        }
        if (publishingYear < 0) {
            throw new IllegalArgumentException("До нашей эры сложно было с публикациями!");
        }
        this.publishingYear = publishingYear;

    }

    @Override
    public boolean equals(Object other) {
        if(this.getClass() != other.getClass()) {
            return false;
        }
        Book firstBook = (Book) other;
        return nameOfBook.equals(firstBook.nameOfBook);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameOfBook);
    }
}
