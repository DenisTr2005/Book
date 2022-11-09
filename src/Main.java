public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[2];
        books[0] = new Book(new Title("Война и мир"),
                new Author("Лев", "Николаевич", "Толстой"));
        books[1] = new Book(new Title("Идиот"),
                new Author("Федор", "Михайлович", "Достоевский"));
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("\"" + book.getTitle().getName() + "\" " +
                    book.getAuthor().getFirstName() + " " +
                    book.getAuthor().getSerName() + " " +
                    book.getAuthor().getLastName());
        }
    }
}