package com.theironyard.charlotte;

/**
 * Created by mfahrner on 8/10/16.
 */
public class Book {
    String title;
    String author;
    String genre;
    int rating;
    String recommend;

    public static Book createBook(String title, String author, String genre, int rating, String recommend) throws Exception {
        return new Book(title, author, genre, rating, recommend);
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
