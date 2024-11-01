package com.example;

public class IdManager 
{
    private unsigned readerIds = 1;
    private unsigned copyIds = 1;

    public unsigned getReaderId()
    {
        return readerIds;
    }

    public unsigned getCopyId()
    {
        return copyIds;
    }

    public addReaderId()
    {
        readerIds++;
    }

    public addCopyId()
    {
        copyIds++;
    }
};