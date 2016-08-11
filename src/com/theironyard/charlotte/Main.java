package com.theironyard.charlotte;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        // create file
        File file = new File("book.json");

        // use filewriter to write
        FileWriter fileWriter = new FileWriter(file);

        //scans file f
        try {
            Scanner scan = new Scanner(file);
            scan.useDelimiter("\\Z");
            String contents = scan.next();
            // deserialize json file
            JsonParser parser = new JsonParser();
            Book b2 = parser.parse(contents, Book.class);

            // print file
            System.out.print(b2);
        }
        catch (IOException e)
        {

        }






        // prompt for updating file
        System.out.println("Would you like to update your file");
        String updatePrompt = scanner.nextLine();

        if (updatePrompt.equalsIgnoreCase("yes")) {
            // prompts for createBook
            System.out.println("1.What is the title of the book?");
            String title = scanner.nextLine();

            System.out.println("2.Who is the author of the book?");
            String author = scanner.nextLine();

            System.out.println("3.What is the genre of the book?");
            String genre = scanner.nextLine();

            System.out.println("4.On a scale of 1-10 rate your enjoyment of the book?");
            String rate = scanner.nextLine();
            int rating = Integer.parseInt(rate);

            System.out.println("5.Would you recommend this book to a friend?");
            String recommend = scanner.nextLine();

            Book b = Book.createBook(title, author, genre, rating, recommend);

            // Turn Book b into JSON object
            JsonSerializer serializer = new JsonSerializer();
            String jsonBook = serializer.serialize(b);

            // use filewriter to write
            fileWriter.write(jsonBook);
            fileWriter.close();
        }
        else if (updatePrompt.equalsIgnoreCase("no")) {

        }















    }
}
