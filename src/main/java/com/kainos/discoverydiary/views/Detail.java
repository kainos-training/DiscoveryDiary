package com.kainos.discoverydiary.views;

import com.kainos.discoverydiary.models.Media;
import io.dropwizard.views.View;

public class Detail extends View {

    private Media media;

    public Detail(Media media){
        super("/Views/Media/detail.ftl");
        this.media = media;
    }

    public Media getMedia() {
        return media;
    }

}
