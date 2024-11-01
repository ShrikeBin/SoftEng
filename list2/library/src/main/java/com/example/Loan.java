package com.example;

import java.time.LocalDate;

public class Loan 
{
    private Copy copy;
    private Reader reader;
    private LocalDate loanDate;

    public Loan(Copy copy, Reader reader) 
    {
        this.copy = copy;
        this.reader = reader;
        this.loanDate = LocalDate.now();
        copy.setAvailable(false);
    }

    public Copy getCopy() 
    {
        return copy;
    }

    public Reader getReader() 
    {
        return reader;
    }

    public LocalDate getLoanDate() 
    {
        return loanDate;
    }

    @Override
    public String toString() 
    {
        return "Loan: " + copy.toString() + " to " + reader.toString() + " on " + loanDate;
    }
}
