package entities;
import java.util.Date;

public class User {
    public String name = "ss";
    public String vote = "ss";
    public String date = " ss";
    public User(String name, String vote){
        this.name = name;
        this.vote = vote;
        Date data = new java.util.Date();
        this.date = data.toString();
    }
    public User(String name){
        this.name = name;
    }
}
