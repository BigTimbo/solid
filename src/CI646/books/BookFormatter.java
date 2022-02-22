package CI646.books;

public abstract class BookFormatter {

    protected final Book book;

    public BookFormatter(Book book) {
        this.book = book;
    }

    public abstract String format();

    public String formatInfo() {
        return book.getTitle() + " [" + book.getLength() + " pages]" +
                "\n" +
                book.getAuthor().getName() +
                "\n";
    }

    public String formatHeader() {
        return book.getAuthor().getName() + ", " + book.getTitle();
    }

    public String formatPage() {
        return book.getCurrentPage();
    }
}