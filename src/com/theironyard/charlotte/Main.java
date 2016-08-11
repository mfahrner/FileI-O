package com.theironyard.charlotte;

import jodd.json.JsonException;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        // create file
        File file = new File("book.json");

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

        } catch (NoSuchElementException e) {

        } catch (FileNotFoundException e) {

        } catch (JsonException e) {
            System.out.println("Sorry This Is Invalid Text");
        }

        // prompt for updating file only if file exists
        if (file.exists()) {
            System.out.println("Would you like to update your information?");
            String updatePrompt = scanner.nextLine();

            if (updatePrompt.equalsIgnoreCase ("yes")) {
                Book b = Book.createBook();

                // Turn Book b into JSON object
                JsonSerializer serializer = new JsonSerializer();
                String jsonBook = serializer.serialize(b);

                // use filewriter to write
                FileWriter fileWriter = new FileWriter(file);

                fileWriter.write(jsonBook);
                fileWriter.close();
            } else {
                System.out.println("thank you come again");
            }
        } else {
            Book b = Book.createBook();

            // Turn Book b into JSON object
            JsonSerializer serializer = new JsonSerializer();
            String jsonBook = serializer.serialize(b);

            // use filewriter to write
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write(jsonBook);
            fileWriter.close();
        }
    }
}
