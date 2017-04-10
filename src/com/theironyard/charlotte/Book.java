package com.theironyard.charlotte;

import java.util.Scanner;

/**
 * Created by mfahrner on 8/10/16.
 */
public class Book {
    String title;
    String author;
    String genre;
    int rating;
    String recommend;

    public Book() {

    }

    public static Book createBook() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);


        System.out.println("1.What is the title of the book?");
        String title = scanner.nextLine();

        System.out.println("2.Who is the author of the book?");
        String author = scanner.nextLine();

        System.out.println("3.What is the genre of the book?");
        String genre = scanner.nextLine();

        System.out.println("4.On a scale of 1-10 rate your enjoyment of the book?");
        int rating = Integer.parseInt(scannerInt.nextLine());

        System.out.println("5.Would you recommend this book to a friend?");
        String recommend = scanner.nextLine();

        return new Book(title, author, genre, rating, recommend);
    }

    @Override
    public String toString() {
        return String.format("Title: %s\nAuthor: %s\nGenre: %s\nRating: %s\nRecommend: %s\n",
                title, author, genre, rating, recommend);
    }

    public Book(String title, String author, String genre, int rating, String recommend) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
        this.recommend = recommend;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
}
