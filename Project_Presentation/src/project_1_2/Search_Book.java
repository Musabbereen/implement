package project_1_2;

import static project_1_2.Main.st;

public class Search_Book extends Library  {
    public static void Find(){
        System.out.println("Enter the name of the Book");
        String name = st.nextLine();
        int u = Library.Book_data();
        if(u==1){
            return ;
        }
        for(int i=0;i<Library.book.size();i++){
            if(Library.book.get(i).getName().equals(name)) {
                System.out.println("The book has been found "+Library.book.get(i).toString());
                Library.book.clear();
                return;
            }
        }
        System.out.println("The book is not found");
        Library.book.clear();
        return ;
    }

}
