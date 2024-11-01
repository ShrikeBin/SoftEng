package com.example;

public class Copy 
{
    private IdManager manager; //to be remade
    private int copyId;
    private boolean isAvailable;
    private Book book;

    public Copy(Book book, IdManager manager) 
    {
        this.manager = manager;
        this.copyId = manager.getCopyId();
        manager.addCopyId();
        this.book = book;
        this.isAvailable = true;
    }

    public int getCopyId() 
    {
        return copyId;
    }

    public boolean isAvailable() 
    {
        return isAvailable;
    }

    public void setAvailable(boolean input) 
    {
        isAvailable = input;
    }

    public Book getBook() 
    {
        return book;
    }

    @Override
    public String toString() 
    {
        return "Copy " + copyId + " of " + book.toString();
    }
}
