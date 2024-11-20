//создаём класс "записная книжка контактов"
public class book
{
    private Integer Id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String note;
    //конструктор
    public book(String firstName, String lastName, String address)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
    }
    //геттеры и сеттеры
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public  void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public String getPhone()
    {
        return phone;
    }
    public String getNote()
    {
        return note;
    }
    public void setNote(String note)
    {
        this.note = note;
    }

    public void setId(Integer Id)
    {
        this.Id = Id;
    }
    public Integer getId()
    {
        return Id;
    }
    //перегрузка вывода
    @Override
    public String toString()
    {
        return  "ID: " + Id + "\n" +
                "Имя: " + firstName + "\n" +
                "Фамилия: " + lastName + "\n" +
                "Адрес: " + address + "\n"+
                "Номер телефона: " + phone + "\n" +
                "Заметка: " + note + "\n";

    }

}
