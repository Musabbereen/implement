package project_1_2;

import Project_1_2_3.User;

import static project_1_2.Main.sc;

public class Admin extends User {
    Admin(String name, String ID) {
        super(name, ID);
    }
    Admin(String name) {
        super(name);
    }
    public static void Admin() throws Exception{
       int  n=1;
        while(n!=0) {
            System.out.println("1:View Books");
            System.out.println("2:Add Book");
            System.out.println("3:Remove Book");
            System.out.println("4:View Orders");
            System.out.println("5:Delete All Data");
            System.out.println("6:Calculate Fine");
            System.out.println("0:Exit");
            n = sc.nextInt();
            switch(n){
                case 0:
                    return;
                case 1:
                    Library.ViewBook();
                    break;
                case 2:
                    Library.addbooks();
                    break;
                case 3:
                    Remove_Book.remove();
                    break;
                case 4:
                    Library.display_orders();
                    break;
                case 5:
                    Library.Remove_All_Data();
                    break;
                default:
                    return ;

            }
        }
    }
}
