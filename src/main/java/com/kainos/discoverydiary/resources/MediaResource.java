package com.kainos.discoverydiary.resources;

import com.codahale.metrics.annotation.Timed;
import com.kainos.discoverydiary.DataStore;
import com.kainos.discoverydiary.models.Media;
import com.kainos.discoverydiary.views.Detail;
import com.kainos.discoverydiary.views.Homepage;
import io.dropwizard.views.View;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("media")
public class MediaResource {

    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View Homepage() {
        List<Media> medias = new ArrayList<Media>(DataStore.medias.values());
        return new Homepage(medias);
    }


    @GET
    @Timed
    @Path("{id}")
    @Produces(MediaType.TEXT_HTML)
    public View Detail(@PathParam("id") int id) {

        return new Detail(DataStore.medias.get(id));
    }
}

