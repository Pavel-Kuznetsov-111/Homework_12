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
    public boolean equals(Book other) {
        if ((this.getBookName() != other.getBookName()) && (this.getBookName() != other.getBookName()) && (this.getBookAge() != other.getBookAge())) {
            return false;
        } else {
            return true;
        }

    }

}
