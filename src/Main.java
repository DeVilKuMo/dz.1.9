public class Main {
    public static void main(String[] args) {
        Author author = new Author("Maxim", "Glushkov");
        Author author1 = new Author("Maxim1", "Glushkov1");
        Author author2 = new Author("Maxim2", "Glushkov2");
        Book book = new Book("Book", author, 1900);
        Book book1 = new Book("Book1", author, 1905);
        Book book2 = new Book("Book2", author, 1909);

        System.out.println(author);
        System.out.println(book2);
    }
}
