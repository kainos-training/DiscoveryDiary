package com.kainos.discoverydiary;

import com.kainos.discoverydiary.config.DiscoveryDiaryConfiguration;
import com.kainos.discoverydiary.models.Category;
import com.kainos.discoverydiary.models.Media;
import com.kainos.discoverydiary.models.Status;
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
        DataStore.medias.add(new Media("Java For Dummies", "J K Bowling", "Training book on java", Category.TECHNICAL, "2001"));
        DataStore.medias.add(new Media("How to HTML", "J K Bowling", "Training book on html", Category.TECHNICAL, "2000"));
        DataStore.medias.add(new Media("CSS: What's that?", "J K Bowling", "Training book on css", Category.TECHNICAL, "2011"));
        DataStore.medias.add(new Media("From beginner to chess master in 10mins", "J K Bowling", "Training book on chess", Category.NON_TECHNICAL, "1980"));
        DataStore.medias.add(new Media("The ins and outs of Ruby on Rails", "Mail Serrif", "Training book on Ruby", Category.TECHNICAL, "1980", "Sean", Status.ON_LOAN));
        DataStore.medias.add(new Media("The Big Book of Java", "Stephen Hawking", "Training book on Java", Category.TECHNICAL, "1980", null, Status.IN_DISREPAIR));
    }
}
