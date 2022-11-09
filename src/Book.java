public class Book {
    private Title title;
    private Author author;

    public Book(Title title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Title getTitle() {
        return this.title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
