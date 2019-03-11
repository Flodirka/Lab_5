import book.*;

public class Main {

    public static void main(String[] args) {


        //Книги - справочники и энциклопедии;
        // создание экземпляра класса
        Book handbook = new Handbook("5656", "Крылов А.А","Телефонный справочник","2017", "АСТ", "телефонный справочник");
        System.out.println(handbook.getDescription()); // вызов метода класса Book , переопределенного в классе Handbook, который возвращает строку с описанием книги
    }}

