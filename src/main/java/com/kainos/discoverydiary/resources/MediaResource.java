package com.kainos.discoverydiary.resources;

import com.codahale.metrics.annotation.Timed;
import com.kainos.discoverydiary.models.Category;
import com.kainos.discoverydiary.models.Media;
import com.kainos.discoverydiary.views.Detail;
import com.kainos.discoverydiary.views.Index;
import io.dropwizard.views.View;
import org.assertj.core.internal.Integers;
import org.assertj.core.internal.cglib.proxy.InvocationHandler;
import org.joda.time.DateTime;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("media")
public class MediaResource {

    public MediaResource() {
        //Dummy Data

    }

    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View Index() {
        return new Index();
    }

    @GET
    @Timed
    @Path("{id}")
    @Produces(MediaType.TEXT_HTML)
    public View Detail(@PathParam("id") int id) {

        System.out.println(id);

        new Media("Array Potter 1", "J K Bowling", "Training book on java", Category.TECHNICAL, "2001");
        new Media("Array Potter 2", "J K Bowling", "Training book on java", Category.TECHNICAL, "2001");
        new Media("Array Potter 3", "J K Bowling", "Training book on java", Category.TECHNICAL, "2001");
        new Media("Array Potter 4", "J K Bowling", "Training book on java", Category.TECHNICAL, "2001");

        return new Detail(Media.medias.get(id));

    }
}
