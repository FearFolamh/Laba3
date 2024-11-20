
import java.util.ArrayList;

public class GroupBook
{
    public String UniqueNumber;
    public ArrayList<book> books;
    //Конструктор по-умолчанию
    public GroupBook()
    {
        UniqueNumber = "Unique Number";
        books = new ArrayList<>();
    }
    //Коструктор с параметром
    public GroupBook(String uniqueNumber, ArrayList<book> books)
    {
        this.UniqueNumber = UniqueNumber;
        this.books = books;
    }
    //Геттеры и сеттеры
    public String getUniqueNumber()
    {
        return UniqueNumber;
    }
    public void setUniqueNumber(String UniqueNumber)
    {
        this.UniqueNumber = UniqueNumber;
    }
    public ArrayList<book> getBooks()
    {
        return books;
    }
    public void setBooks(ArrayList<book> books)
    {
        this.books = books;
    }
    //методы
    public void addBook(book book1)
    {
        books.add(book1);
    }
    //удаления эллемента по имени
    public void removeByBookName(String firstName)
    {
        books.removeIf(book1->book1.getFirstName().equals(firstName));
    }
}
