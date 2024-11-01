package com.example;

public class Reader 
{
    private String name;
    private int readerId;
    private static int idCounter = 1;

    public Reader(String name) 
    {
        this.name = name;
        this.readerId = idCounter++;
    }

    public String getName() 
    {
        return name;
    }

    public int getReaderId() 
    {
        return readerId;
    }

    @Override
    public String toString() 
    {
        return "Reader " + readerId + ": " + name;
    }
}
