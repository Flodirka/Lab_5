package book;

public abstract class Book { // абстрактный класс Книга


    // приватные поля
    private String сode;  // код книги
    private String nameAuthor;  // автор
    private String nameBook;  // название книги
    private String year;   // год издания
    private String publishing;  // издательство


    // конструктор
    public Book(String code, String nameAuthor, String nameBook, String year, String publishing) {

        // инициализация полей в конструкторе
        this.сode = code;
        this.nameAuthor = nameAuthor;
        this.nameBook = nameBook;
        this.year = year;
        this.publishing = publishing;
    }

    // абстрактный метод для получения строки с описанием книги
    public abstract String getDescription();

    // метод для получения кода книги
    public String getСode() {
        return this.сode;
    }

    // метод для получения Автора
    public String getNameAuthor() {
        return this.nameAuthor;
    }

    // метод для получения  названия книги
    public String getNameBook() {
        return this.nameBook;
    }

    // метод для получения года издания книги
    public String getYear() {
        return this.year;
    }

    // метод для получения названия издательства
    public String getPublishing() {
        return this.publishing;
    }
}
