package com.theironyard.charlotte;

import jodd.json.JsonException;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by mfahrner on 4/10/17.
 */
public class Json {

    public Json() {
    }

    public Book readJson(File file) {
        Book b = new Book();
        try {
            Scanner scan = new Scanner(file);
            scan.useDelimiter("\\Z");
            String contents = scan.next();

            JsonParser parser = new JsonParser();
            b = parser.parse(contents, Book.class);

        } catch (NoSuchElementException e) {

        } catch (FileNotFoundException e) {

        } catch (JsonException e) {
            System.out.println("Sorry This Is Invalid Text");
        }
        return b;
    }

    public void writeJson(Book b, File file) {
        try {
            JsonSerializer serializer = new JsonSerializer();
            String jsonBook = serializer.serialize(b);

            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write(jsonBook);
            fileWriter.close();
        } catch (IOException e) {

        }
    }
}
