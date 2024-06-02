package project_1_2;

import Project_1_2_3.User;

public class Order extends Library{
    static User user;
    static Book bookk;
    static String borrow_date;
    static String return_date;
    static String User_name;
    static String book_name;
    int quantity;
    public Order(User user,Book book){
            this.user = user;
            this.bookk = book;

    }
    public Order(){

    }
    public Order(String user_name,String book_name,String borrow_date,String return_date,int quantity){
            this.return_date = return_date;
            this.User_name = user_name;
            this.quantity = quantity;
            this.borrow_date = borrow_date;
            this.book_name = book_name;
    }
}
