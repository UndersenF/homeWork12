public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Johana", "Rowling");
        Author secoundAuthor = new Author("Irvin", "Yalom");

        Book firstBook = new Book("Harry Potter", firstAuthor, 2000);
        Book secondBook = new Book("When Nietzsche Wept", secoundAuthor, 1992);

        System.out.println("Год публикации до изменения - " + secondBook.getPublishingYear());
        secondBook.setPublishingYear(1995);
        System.out.println("Год публикации после - " + secondBook.getPublishingYear());
    }
}