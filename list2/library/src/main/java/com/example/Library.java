package com.example;

import java.util.ArrayList;
import java.util.List;

public class Library 
{
    private List<Book> books = new ArrayList<>();
    private List<Copy> copies = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void addBook(String title, String author) 
    {
        Book book = new Book(title, author);
        books.add(book);
        System.out.println("Added book: " + book);
    }

    public void addCopy(String title) 
    {
        for (Book book : books) 
        {
            if (book.getTitle().equals(title)) 
            {
                copies.add(new Copy(book));
                return;
            }
        }
        System.out.println("Book not found. Add the book first.");
    }

    public void addReader(String name) 
    {
        readers.add(new Reader(name));
    }

    public void lendBook(int copyId, int readerId) //to be fixed
    {
        Copy copy = findCopyById(copyId);
        Reader reader = findReaderById(readerId);

        if (copy != null && copy.isAvailable() && reader != null) 
        {
            Loan loan = new Loan(copy, reader);
            loans.add(loan);
            System.out.println("Loan successful: " + loan);
        } 
        else 
        {
            System.out.println("Loan failed. Copy might not be available or Reader not found.");
        }
    }

    private Copy findCopyById(int copyId) // to be fixed
    {
        for (Copy copy : copies) 
        {
            if (copy.getCopyId() == copyId) 
            {
                return copy;
            }
        }
        return null;
    }

    private Reader findReaderById(int readerId) // to be fixed
    {
        for (Reader reader : readers) 
        {
            if (reader.getReaderId() == readerId) 
            {
                return reader;
            }
        }
        return null;
    }

    public void displayBooks() 
    {
        System.out.println("Books in library:");
        for (Book book : books) 
        {
            System.out.println(book);
        }
    }

    public void displayCopies() 
    {
        System.out.println("Copies in library:");
        for (Copy copy : copies) 
        {
            System.out.println(copy);
        }
    }

    public void displayReaders() 
    {
        System.out.println("Readers registered in library:");
        for (Reader reader : readers) 
        {
            System.out.println(reader);
        }
    }
}