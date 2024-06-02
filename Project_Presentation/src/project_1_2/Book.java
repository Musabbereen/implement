package project_1_2;

public class Book{

    private String Name;
    private String ISBN;
    private String Author;
    private String Type;
    private double price;
    private int quantity;



    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Book(){

    }
    public Book(String name,String ISBN,String type,String Author,double price,int quantity){
        this.Name = name;
        this.ISBN = ISBN;
        this.Type = type;
        this.Author = Author;
        this.price = price;
        this.quantity = quantity;
    }
    public Book(String name,double price,int quantity){
        this.Name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Book(String name,double price){
        this.Name = name;
        this.price = price;

    }
    public String toString(){
        return getName()+","+getISBN()+","+getType()+","+getAuthor()+","+getPrice()+","+getQuantity();
    }
}
