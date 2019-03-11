package book;

public class Handbook extends Book {

    private String type; //приватное поле тип справочника

    //конструктор класса Handbook
    public Handbook(String code, String nameAuthor, String nameBook, String year, String publishing, String type) {
        super(code, nameAuthor, nameBook, year, publishing); //  вызов конструктора суперкласса

        this.type = type;
    }

    // переопределение метода из абстрактного суперкласса
    @Override
    public String getDescription() {
        return "Шифр справочника : "+getСode()+ ", Автрор справочника "+ getNameAuthor()+
                ", Название "+ getNameBook() + " Год издания и издтельство "+getYear()+" "+ getPublishing()+", тип справочника :"+getType();
    }

    // получение типа справочника
    public  String getType()
    {
        return  this.type ; }  }
