package project_1_2;

import Project_1_2_3.User;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;

import static project_1_2.Main.sc;
import static project_1_2.Main.st;

public class Library{
    static String order_name;
    static String order_Id;
    static final int Borrow_time = 10;
    static int u=0;
    static ArrayList<User> user = new ArrayList<>();
    static ArrayList<Book> book = new ArrayList<>();
    static ArrayList<BorrowBook> orders = new ArrayList<>();
    public static void addusers(User userr){
        user.add(userr);
        try {
            FileWriter fw = new FileWriter("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Users",true);
            fw.write(userr.toString());
            fw.write("\n");
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void addbooks(){
        Book b1  = new Book();
        try {
            System.out.println("Enter the Book_Name:");
            String name = st.nextLine();
            System.out.println("Enter the name of the Author:");
            String Author = st.nextLine();
            System.out.println("Enter ISBN");
            String ISBN = st.nextLine();
            System.out.println("Enter price");
            double price = sc.nextInt();
            System.out.println("Enter the Quantity:");
            int Quantity = sc.nextInt();
            System.out.println("Enter the Type:");
            String type = st.nextLine();

            b1.setName(name);
            b1.setAuthor(Author);
            b1.setISBN(ISBN);
            b1.setType(type);
            b1.setPrice(price);
            b1.setQuantity(Quantity);
            book.add(b1);
        }
        catch(InputMismatchException e){
            System.out.println("The data is invalid");
            return;
        }
        try {
            FileWriter fw = new FileWriter("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Book.txt",true);
            fw.write(b1.toString());
            fw.write("\n");
            fw.close();
        }
        catch(Exception e){

        }
        return ;
    }

    public static void SearchUser(String name,String ID){
        try {
            FileReader fr = new FileReader("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Users");
            BufferedReader br = new BufferedReader(fr);
            int n=0;
            while (br.ready()) {
                String str = br.readLine();
                String data[] = str.split(",");
                if(data[0].equals(name) && data[1].equals(ID)){
                    n=1;
                    System.out.println("Welcome Mr "+data[0]);
//                    order_name = data[0];
//                    order_Id = data[1];
                    NormalUser.NormalUser();
                    return ;
                }

            }
            if(n==0){
                System.out.println("the user does not exist");
                return ;
            }
        }
        catch(FileNotFoundException e){
            System.out.println("The file has not been found");
        }
        catch(IOException e){
            System.out.println("the data is not accessible");
        }

    }
    public static void  ViewBook() {
        try {
            FileReader fr = new FileReader("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Book.txt");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                String line = br.readLine();
                String str[] = line.split(",");
                System.out.println("Name: "+str[0]+"\t"+"ISBN: "+str[1]+"\t" + "Type: "+str[2]+"\t"+"Author:"+str[3]+"\t"+"Price: " +str[4]+"\t"+"Quantity: "+str[5]);

            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
public static int  Book_data() {
        try {
            FileReader fr = new FileReader("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Book.txt");
            BufferedReader br = new BufferedReader(fr);

            while(br.ready()){

                String line = br.readLine();
                try {
                    if (line.isEmpty()) {
                            throw new Exception();
                    }
                }
                catch(Exception e){
                    System.out.println("The file is empty");
                    u=1;
                    return u;
                }
                String str[] = line.split(",");
                book.add(new Book(str[0],str[1],str[2],str[3],Double.parseDouble(str[4]),Integer.parseInt(str[5])));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    return 0;
}
public static void Update_data(ArrayList<Book> b1){
        try {
            FileWriter fw = new FileWriter("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Book.txt");
            for (int i = 0; i < b1.size(); i++) {

                fw.write(b1.get(i).toString());
                fw.write("\n");

            }
            fw.close();
        }
        catch(Exception e){
            System.out.println("What the hell is just happening");
        }
    }

 public static void Remove_All_Data(){
        book.clear();
        user.clear();
        try {
            FileWriter fw1 = new FileWriter("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Order_data");
            FileWriter fw2 = new FileWriter("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Users");
            FileWriter fw3 = new FileWriter("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Book.txt");
            fw1.write(" ");
            fw2.write(" ");
            fw3.write(" ");
            fw1.close();
            fw2.close();
            fw3 .close();

        }
        catch(IOException e){

        }
 }
public static void addorders(String  user_name ,String  book_name,String borrow_date,String return_date,int quantity) {
    BorrowBook bb = new BorrowBook(user_name, book_name, borrow_date, return_date, quantity);
    orders.add(bb);
    try {
        FileWriter fw1 = new FileWriter("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Order_data", true);
        fw1.write(bb.toString());
        fw1.write("\n");
        fw1.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
public static void Update_Orders(ArrayList<BorrowBook>orders ){
        try {
            FileWriter fw1 = new FileWriter("C:/Users/zafor/Desktop/OOP2/Only practice/src/project_1_2/Order_data",true);
            for(int i=0;i<orders.size();i++) {
                fw1.write(orders.toString());
                fw1.write("\n");
            }
            fw1.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
}
public static void display_orders(){
        for(int i=0;i<orders.size();i++){
            System.out.println(orders.get(i));
        }
}
}
