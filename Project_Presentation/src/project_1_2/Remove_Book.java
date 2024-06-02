package project_1_2;

import static project_1_2.Main.st;

public class Remove_Book extends Library{
    public static void remove() throws Exception{
        Search_Book.Book_data();
        if(Library.u==1){
            Library.u=0;
            return ;
        }
        System.out.println("Enter the name of the Book");
        String name = st.nextLine();

        for(int i=0;i<Library.book.size();i++){
            if(Library.book.get(i).getName().equals(name)) {
                System.out.println(Library.book.get(i).getName());
                Library.book.remove(i);
                System.out.println("The book is successfully removed");
                break;
            }

        }

            Remove_Book.Update_data(Library.book);

                return ;
    }
}
