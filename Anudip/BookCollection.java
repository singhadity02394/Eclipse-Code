package Anudip;

import java.util.ArrayList;
class Book{
    ///private member
    private int bookid ;
    private String bookname;
    private String authorname;
    //constructer

    Book(int bookid,String bookname,String authorname){
        this.bookid = bookid;
        this.bookname=bookname;
        this.authorname=authorname;
    }


    public int getBookid(){
        return bookid;
    }

    public String getBookName() {

        return bookname;
    }

    public String getAuthorName() {
        return authorname;
    }



}

public class BookCollection {
    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "dsa", "Narasimha Karumanchi"));
        books.add(new Book(2, "python ", "Harper Lee"));
        books.add(new Book(3, "java", "Herbert Schildt"));


        System.out.println("Print all book  Details:");
        for(Book b:books){
            System.out.println("Book id:" + b.getBookid());
            System.out.println("Book name:" +b.getBookName());
            System.out.println("Book author:" +b.getAuthorName());

            System.out.println("========");
        }
    }
}
