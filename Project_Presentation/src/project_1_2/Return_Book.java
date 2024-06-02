package project_1_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static project_1_2.Main.st;

public class Return_Book extends Order{

    static int u=0;
    public static void returnn(String name,String ID){
        try {
            System.out.println("Enter the name of the book");
            String name_book = st.nextLine();
            for(int i=0;i<Library.orders.size();i++){
                if(Library.orders.get(i).User_name.equals(name) && Library.orders.get(i).book_name.equals(name_book)){
                    System.out.println("The book is successfully returned");
                    Calculate_fine(Library.orders.get(i).return_date);
                    return_quantity(name_book,Library.orders.get(i).quantity);
                    Library.orders.remove(i);
                    Library.Update_Orders(Library.orders);
                }
            }


        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The list is empty");

        }
    }

    public static void return_quantity(String book_name,int quantity){
        for(int i=0;i<Library.book.size();i++){
            if(Library.book.get(i).getName().equals(book_name)){
                int n = Library.book.get(i).getQuantity();
                Library.book.get(i).setQuantity(quantity+n);
                Library.Update_data(Library.book);
                return ;

            }
        }
    }
    public static void Calculate_fine(String return_date){
        System.out.println("Enter the date in YYYY-MM--DD format");
        String date = st.nextLine();
        String format  = "yyyy-MM-dd";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
        LocalDate ldb = LocalDate.parse(return_date,dtf);
        LocalDate ldr = LocalDate.parse(date,dtf);
        if(ldb.isBefore(ldr)){
            System.out.println("The borrower will be fined");
        }
        else{
            System.out.println("There is no fine");
        }

    }


}
