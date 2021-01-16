package com.sunny;

import java.io.Serializable;

public class SerializeDataFrom implements Serializable {

   // public boolea name;
    public String name;
    public int id;
    public String email;

    public SerializeDataFrom(String name, int id, String email){

        this.name = name;
        this.id = id;
        this.email = email;
    }
}
