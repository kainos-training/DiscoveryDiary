package com.kainos.discoverydiary;

import com.kainos.discoverydiary.models.Category;
import com.kainos.discoverydiary.models.Media;
import com.kainos.discoverydiary.models.Status;
import com.kainos.discoverydiary.resources.MediaResource;
import org.junit.Assert;
import org.junit.Test;

public class BorrowTest {

    @Test
    public void shouldBorrowBook() {
        //Arrange
        Media media = new Media("Java For Dummies", "J K Bowling", "Training book on java", Category.TECHNICAL, "2001");
        DataStore.medias.put(media.getId(), media);
        MediaResource mediaResource = new MediaResource();

        //Act
        mediaResource.Borrow(media.getId(),"Borrower");

        //Assert
        Assert.assertEquals("Borrower", media.getNameOfBorrower());
        Assert.assertEquals(Status.ON_LOAN, media.getStatus());
    }

    @Test
    public void shouldNotBorrowBook() {
        Media media = new Media("Java For Dummies", "J K Bowling", "Training book on java", Category.TECHNICAL, "2001", "Borrower", Status.ON_LOAN);
        DataStore.medias.put(media.getId(), media);
        MediaResource mediaResource = new MediaResource();

        //Act
        mediaResource.Borrow(media.getId(),"NewBorrower");

        //Assert
        Assert.assertNotEquals("NewBorrower", media.getNameOfBorrower());
    }

}
