package com.theironyard.charlotte;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Book book = new Book();
        Json something = new Json();
        File file = new File("book.json");


        if (file.exists()) {
            System.out.println(something.readJson(file));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like to update your information? [y/n]");
            String updatePrompt = scanner.nextLine();
            if (updatePrompt.equalsIgnoreCase("y")) {
                something.writeJson(book.createBook(), file);
            } else {
                System.out.println("Have a nice day");
            }
        } else {
            File file2 = new File("book.json");
            something.writeJson(book.createBook(), file2);
        }
    }
}
