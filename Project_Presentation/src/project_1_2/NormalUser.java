package project_1_2;

import Project_1_2_3.User;

import java.util.Scanner;

public class NormalUser extends User {
    static Scanner sc = new Scanner(System.in);

    NormalUser(String name, String ID) {
        super(name, ID);
    }
    NormalUser(String name) {
        super(name);
    }
    public static void NormalUser(){
         int n=1;
        while(n!=0) {
            System.out.println("1:Search Books");
            System.out.println("2:View Books");
            System.out.println("3:BorrowBook");
            System.out.println("4:ReturnBook");
            System.out.println("0:Exit");
            n = sc.nextInt();
            switch(n){
                case 0:
                    return;
                case 1:
                    Search_Book.Find();
                    break;
                case 2:
                    Library.ViewBook();
                    break;
                case 3:
                    BorrowBook.borrow(order_name,Main.order_ID);
                    break;
                case 4:
                    Return_Book.returnn(order_name,Main.order_ID);
                    break;
                default:
                    break;

            }
        }

    }
}
