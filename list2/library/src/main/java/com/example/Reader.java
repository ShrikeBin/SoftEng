package com.example;

public class Reader 
{
    private IdManager manager;
    private String name;
    private int readerId;
    private static int idCounter = 1;// add class counter to mange ID's

    public Reader(String name, IdManager manager) 
    {
        this.name = name;
        this.readerId = manager.getReaderId();
        manager.addReaderId();
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
