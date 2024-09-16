import java.util.Objects;

public class Book {

    private String bookName;
    private Author author;
    private int bookAge;

    public Book(String bookName, Author author, int bookAge) {
        this.bookName = bookName;
        this.author = author;
        this.bookAge = bookAge;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookAge() {
        return this.bookAge;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBookAge(int i) {
    }

    public String toString() {
        return "Название книги " + this.bookName + " Год написания книги" + this.bookAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookAge == book.bookAge && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, bookAge);
    }

    public boolean equals(Book other, Object o) {
        if ((this.getBookName() != other.getBookName()) && (this.getBookName() != other.getBookName()) && (this.getBookAge() != other.getBookAge())) {
            return false;
        } else {
            return true;
        }

        }


    }
