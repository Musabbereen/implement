package Project_1_2_3;

import project_1_2.Admin;
import project_1_2.Library;
import project_1_2.NormalUser;

import java.util.Scanner;

public class Main {
        static int n;

        static Scanner st = new Scanner(System.in);
        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) throws Exception {
            Library data = new Library();


            System.out.println("                                                                            Welcome to Library Management System                                                  ");
            System.out.println("\n"); System.out.println("\n");
            System.out.println("1:Login");
            System.out.println("2:New User");
            System.out.println("0: Exit");
            int n = sc.nextInt();
            if(n==0){
                return ;

            }

            while(n!=0){
                if(n==1){
                    Login();
                }
                else if(n==2){
                    NewUser();
                }
                System.out.println("1:Login");
                System.out.println("2:New User");
                System.out.println("0: Exit");
                n = sc.nextInt();

            }
        }
    public static  void Login(){
        System.out.println("Enter Username");
        String name = st.nextLine();
        System.out.println("Enter ID");
        String ID = st.nextLine();
        //  order_name = name;
     // order_ID = ID;
        Library.SearchUser(name,ID);
    }
    public static void NewUser() throws Exception {
        System.out.println("1:Normal User");
        System.out.println("2:Admin");
        System.out.println("0:Exit");
        n = sc.nextInt();
        if(n==0){
            return ;
        }
        else {
            System.out.println("Enter Username");
            String name = st.nextLine();
            System.out.println("Enter ID");
            String ID = st.nextLine();
            System.out.println("Welcome Mr " + name);
            if(n==1) {
                NormalUser nu  = new NormalUser(name,ID);

            }
            else if(n==2){
                Admin admin = new Admin(name,ID);

                Admin.Admin();
            }
        }

    }

}

