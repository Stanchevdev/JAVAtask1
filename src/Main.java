import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        libraries Royal = new libraries();
        Royal.addBook();
    }


    static class libraries{
        String[] books;

        void addBook(){
            String content;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Name of the book: ");
            String bookName = scanner.nextLine();
            if (bookName.isEmpty()) System.out.println("Cannot be empty");

            System.out.print("Name of the author: ");
            String authorName = scanner.nextLine();
            if (authorName.isEmpty()) System.out.println("Cannot be empty");

            System.out.print("Publishing House: ");
            String publishingHouse = scanner.nextLine();
            if (publishingHouse.isEmpty()) System.out.println("Cannot be empty");

            System.out.print("Year of publishing: ");
            int yearOfPublishing = scanner.nextInt();
            if(yearOfPublishing < 1000 && yearOfPublishing > Calendar.getInstance().get(Calendar.YEAR)) System.out.println("Year of publishing must be greater than 1000 and not greater than current year!");

            System.out.print("ISBN: ");
            String ISBN = scanner.nextLine();
            if (ISBN.isEmpty()) System.out.println("Cannot be empty");

            books book = new books();
            book.name = bookName;
            book.Author = authorName;
            book.publishingHouse = publishingHouse;
            book.yearOfPublishing = yearOfPublishing;
            book.ISBN = ISBN;
            System.out.println(book.name + " " + book.Author + " " + book.publishingHouse + " " + book.yearOfPublishing + " " + book.ISBN);
        }

    }

    static class books{
        String name;
        String Author;
        String publishingHouse;
        int yearOfPublishing;
        String ISBN;
    }

}
