package com.example.myapplication.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
    public  String username;
    public String password;

    // creando una funcion para recorrere los usuarios
    public static  Boolean passordIsValid (String User, String Password){

        for(Users i:getUsers()){
            if (i.username.equals(User) && i.password.equals(Password)){
                return  true;
            }
        }
        return  false;

    }

    public  static List<Users> getUsers(){
        List<Users> list = new ArrayList<Users>();
        Users o = new Users();
        o.username = "admin";
        o.password = "123";
        list.add(o);

        Users t = new Users();
        t.username = "fany";
        t.password = "123";
        list.add(t);

        Users a = new Users();
        a.username = "daysi";
        a.password = "123";
        list.add(a);
        return list;
    }
}
