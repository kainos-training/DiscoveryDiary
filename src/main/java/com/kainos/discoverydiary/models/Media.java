package com.kainos.discoverydiary.models;

import java.util.ArrayList;

/**
 * Created by benl on 03/11/2016.
 */
public class Media {


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    private int id;
    private String title;
    private String author;
    private String description;
    private Category category;
    private int publicationDate;
    private String imageUrl;

    public static ArrayList<Media> medias = new ArrayList<Media>();


    private static int count;



    public Media(String title, String author, String description, Category category, int publicationDate, String imageUrl) {
        this.id = count++;
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
        this.publicationDate = publicationDate;
        this.imageUrl = imageUrl;
        medias.add(this);


    }








}
