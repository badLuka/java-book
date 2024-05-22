import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Book book = new Book();

        book.setMetaTitle();
        book.setMetaAuthor();
        book.setMetaGenre();

        System.out.println("Книгу " + book.getTitle() + " написал " + book.getAuthor() + " в жанре " + book.getGenre());

    }

    private String title;
    private String author;
    private String genre;


    private void setMetaTitle() {
        Scanner titleScan = new Scanner(System.in);
        System.out.println("Введите название книги ");
        String titleBook = titleScan.nextLine();
        setTitle(titleBook);
    }

    private void setMetaAuthor() {
        Scanner authorScan = new Scanner(System.in);
        System.out.println("Введите автора книги ");
        String authorBook = authorScan.nextLine();
        setAuthor(authorBook);
    }

    private void setMetaGenre() {
        Scanner genreScan = new Scanner(System.in);
        System.out.print("Введите жанр книги ");
        String genreBook = genreScan.nextLine();
        setGenre(genreBook);
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String  getGenre() {
        return genre;
    }
}
