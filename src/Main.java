public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Johana", "Rowling");
        Author secondAuthor = new Author("Irvin", "Yalom");

        Book firstBook = new Book("Harry Potter", firstAuthor, 2000);
        Book secondBook = new Book("When Nietzsche Wept", secondAuthor, 1992);
        Book thirdBook = new Book("When Nietzsche Wept", secondAuthor, 1995);

        System.out.println("Год публикации до изменения - " + secondBook.getPublishingYear());
        secondBook.setPublishingYear(1995);
        System.out.println("Год публикации после - " + secondBook.getPublishingYear());

        System.out.println("\n" + secondAuthor);

        boolean bookComparison = thirdBook.equals(secondBook);
        System.out.println(bookComparison);


    }
}