package com.example.springdemo.Models;

public class Pet
{
    private String type;
    private String name;

    public Pet(String type, String name)
    {
        this.type = this.type;
        this.name = name;
    }

    //Getter
    public String       getType()           {return type;}
    public String       getName()           {return name;}

    //Setter
    public void     setType(String type)            {this.type = type;}
    public void     setName(String name)            {this.name = name;}
}

