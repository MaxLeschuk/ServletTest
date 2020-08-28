package models;

import entities.User;

import java.util.ArrayList;
import java.util.List;


public class Model {
    private static Model instance = new Model();
    public List<User> model = new ArrayList<User>();
    int yes=0,no=0;
    public static Model getInstance() {
        return instance;
    }
    public List<User> getUserList(){
        return model;
    }
    public void add(User user) {
        model.add(user);
        if(user.vote.equals("YES")==false){
            no++;
        }else{
            yes++;
        }
    }
    public int getYes(){
        return yes;
    }
    public int getNo(){
        return no;
    }
}
