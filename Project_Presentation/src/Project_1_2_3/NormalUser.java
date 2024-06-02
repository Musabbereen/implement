package Project_1_2_3;

import project_1_2.Search_Book;

import static Project_1_2_3.Main.sc;

public class NormalUser extends User{
    NormalUser(String name, String ID) {
        super(name, ID);
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


            }

        }
    }
}