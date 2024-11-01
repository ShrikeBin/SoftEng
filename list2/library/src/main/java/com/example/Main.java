package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Library library = new Library();

        try (Scanner scanner = new Scanner(System.in)) 
        {
            while (true) 
            {
                System.out.println("\n1. Add Book");
                System.out.println("2. Add Copy");
                System.out.println("3. Add Reader");
                System.out.println("4. Lend Book");
                System.out.println("5. Display Books");
                System.out.println("6. Display Copies");
                System.out.println("7. Display Readers");
                System.out.println("0. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) 
                {
                    case 1:
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        library.addBook(title, author);
                        break;
                    case 2:
                        System.out.print("Enter book title for adding a copy: ");
                        title = scanner.nextLine();
                        library.addCopy(title);
                        break;
                    case 3:
                        System.out.print("Enter reader name: ");
                        String readerName = scanner.nextLine();
                        library.addReader(readerName);
                        break;
                    case 4:
                        System.out.print("Enter copy ID: ");
                        int copyId = scanner.nextInt();
                        System.out.print("Enter reader ID: ");
                        int readerId = scanner.nextInt();
                        library.lendBook(copyId, readerId);
                        break;
                    case 5:
                        library.displayBooks();
                        break;
                    case 6:
                        library.displayCopies();
                        break;
                    case 7:
                        library.displayReaders();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
}
