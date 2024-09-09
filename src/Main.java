import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        Author bookOne = new Author("Иван ", "Тургенеев ");
        Author bookTwo = new Author("Михаил ", "Шолохов ");
        Book one = new Book("Отцы и дети ", bookOne, 1861);
        Book two = new Book("Донские рассказы ", bookTwo, 1926);
        System.out.println("Название книги - " + one.getBookName() + "Автор - " + bookOne.getFirstName() + "  " + bookOne.getLastName() + " Год публикации - " + one.getBookAge());
        System.out.println("Название книги - " + two.getBookName() + "Автор - " + bookTwo.getFirstName() + "  " + bookTwo.getLastName() + " Год публикации - " + two.getBookAge());


    }
}





