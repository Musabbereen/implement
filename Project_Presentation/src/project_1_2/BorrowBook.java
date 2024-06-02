package project_1_2;

import Project_1_2_3.User;

import java.time.LocalDate;

import static project_1_2.Main.sc;
import static project_1_2.Main.st;

public class BorrowBook extends Order {

    static String Borrow_Date;
    static String Return_Date;
     static String User_name;
     static String Book_name;

    public BorrowBook(User user, Book book) {
        super(user,book);
        this.user = user;
        this.bookk = book;

    }
    public BorrowBook(User user, Book book,String date,int quantity) {
        super(user,book);
        this.user = user;
        this.bookk = book;


    }
    public BorrowBook(String user_name,String book_name,String borrow_date,String return_date,int quantity){
        this.return_date = return_date;
        this.User_name = user_name;
        this.quantity = quantity;
        this.borrow_date = borrow_date;
        this.book_name = book_name;
    }

    public static  void borrow(String name,String ID){
                Library.book.clear();

                     Library.Book_data();
                     System.out.println("Enter the name of the book ");
                     String book_name = st.nextLine();
                     for(int i=0;i<Library.book.size();i++){
                        if(Library.book.get(i).getName().equals(book_name) && Library.book.get(i).getQuantity()>0){
                            System.out.println("The book is available: ");
                            System.out.println("Enter the Quantity");
                            int  quantity = sc.nextInt();

                            user = new User(name,ID);
                            bookk = Library.book.get(i);
                            Borrow_Date = LocalDate.now().toString();
                           long  add = Library.Borrow_time;
                            Return_Date =  LocalDate.now().plusDays(add).toString();
                            int n  = Library.book.get(i).getQuantity();
                            Library.book.get(i).setQuantity(n-quantity);
                            Library.Update_data(Library.book);
                            Library.addorders(user.getName(),bookk.getName(),Borrow_Date,Return_Date,quantity);

                            break;
                        }
                }


    }
    public String toString(){
        return user.getName()+","+bookk.getName()+","+Borrow_Date+","+Return_Date+","+quantity;
    }



}
