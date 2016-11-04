package com.kainos.discoverydiary;

import com.kainos.discoverydiary.config.DiscoveryDiaryConfiguration;

import com.kainos.discoverydiary.models.Category;
import com.kainos.discoverydiary.models.Media;
import com.kainos.discoverydiary.resources.MediaResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.forms.MultiPartBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class DiscoveryDiaryApplication extends Application<DiscoveryDiaryConfiguration> {
    @Override
    public void initialize(Bootstrap<DiscoveryDiaryConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<DiscoveryDiaryConfiguration>());
        bootstrap.addBundle(new AssetsBundle("/assets", "/assets"));
        bootstrap.addBundle(new MultiPartBundle());
    }

    public void run(DiscoveryDiaryConfiguration discoveryDiaryConfiguration, Environment environment) throws Exception {
        final MediaResource mediaResource = new MediaResource();
        environment.jersey().register(mediaResource);
        addDummyData();
    }

    public static void main(String[] args) throws Exception {
        new DiscoveryDiaryApplication().run(args);
    }

    public static void addDummyData() {
        addMedia(new Media("Advances in Relationship Marketing", "Adrian Payne", "Advances in Relationship Marketing by Adrian Payne", Category.TECHNICAL, "1995", "https://www.asme.org/getmedia/c2c8ea5a-b690-4ba7-92bb-34bd1432862b/book_guide_hero_books.aspx"));
        addMedia(new Media("Windows Server 2003 Network Infrastructure", "Craig Zacker", "Study guide for MCSE Exam 70-293", Category.TECHNICAL, "2004", "https://images-na.ssl-images-amazon.com/images/I/51Zu4ldN6PL._SX408_BO1,204,203,200_.jpg"));
        addMedia(new Media("Security+", "Emmett Dulaney", "CompTIA Security+Study Guide, Fifth Edition", Category.TECHNICAL, "2011", "https://images-na.ssl-images-amazon.com/images/I/51b1x0wczGL._AC_UL320_SR246,320_.jpg"));
        addMedia(new Media("UNIX System V An introduction", "Kenneth H. Rosen, Richard R. Rosinski, James M. Farber ", "SAn excellent introduction to AT&T’s Unix System V release", Category.TECHNICAL, "1990", "https://cdn2.kainos.com/wp-content/uploads/2013/11/david-main.jpg?1869db"));
        addMedia(new Media("Oat So Simple", "Quaker", "9 sachets of porridge", Category.NON_TECHNICAL, "2016", "https://www.quaker.co.uk/images/default-source/products/quaker-traditional-oats/quaker-oats-1kg.png?sfvrsn=8"));
    }

    public static void addMedia(Media media) {
        DataStore.medias.put(media.getId(), media);
    }
}
