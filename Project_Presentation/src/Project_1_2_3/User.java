package Project_1_2_3;

import project_1_2.Library;

public class User extends Library {
    private String name;
    private String mobile_number ;
    private String  ID;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String  getID() {
        return ID;
    }

    public void setID(String  ID) {
        this.ID = ID;
    }
    User(String name,String ID){
        this.name = name;
        this.ID = ID;
    }
    User(String name){
        this.name = name;
    }
    public String toString(){
        return name+","+ID;
    }
}
