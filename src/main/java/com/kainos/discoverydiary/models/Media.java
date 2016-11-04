package com.kainos.discoverydiary.models;

/**
 * Created by benl on 03/11/2016.
 */
public class Media  implements Comparable<Media> {

    private String title;
    private String author;
    private String description;
    private Category category;
    private String publicationDate;
    private String imageUrl;

    private static int count = 0;

    public Media(String title, String author, String description, Category category, String publicationDate, String imageUrl) {

        count++;
        this.id = count;
        this.title = title;
        this.author = author;
        this.description = description;
        this.category = category;
        this.publicationDate = publicationDate;
        this.imageUrl = imageUrl;
    }


    private int id;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public static int getCount() {
        return count;
    }


    @Override
    public int compareTo(Media o) {
        return  this.title.compareTo(o.title);
    }
}

