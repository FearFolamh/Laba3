import java.util.Scanner;

public class Main
{
    static Scanner in = new Scanner(System.in);
    static String a= in.nextLine();

    public static void main(String[] args)
    {
        //Объект класса
        book book1= new book( "Константин","Рух", "7 Коней мира, дом 3");
        book1.setId(12);
        book1.setPhone("89532751965");
        book1.setNote("Страшный человек");
        System.out.println(book1);
    }

}