package com.kainos.discoverydiary.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.collect.Lists;
import com.kainos.discoverydiary.DataStore;
import com.kainos.discoverydiary.models.Person;
import com.kainos.discoverydiary.views.PeopleAddView;
import com.kainos.discoverydiary.views.PeopleListView;
import io.dropwizard.views.View;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Strings;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Path("people")
public class PeopleResource {

    DataStore dataStore;

    public PeopleResource(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View index(){
        return new PeopleListView(dataStore.getPeople());
    }

    @Path("add")
    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View add(){
        return new PeopleAddView(new ArrayList<String>());
    }

    @Path("add")
    @POST
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View addPerson(@FormParam("name") String name, @FormParam("age") Integer age){

        List<String> errors = Lists.newArrayList();

        if (Strings.isNullOrEmpty(name)) {
            errors.add("Enter a valid name");
        }

        if (age == null || age < 0 || age > 120) {
            errors.add("Enter a valid age between 1 and 120");
        }

        if (!errors.isEmpty()) {
            return new PeopleAddView(errors);
        }

        dataStore.registerPerson(name, age);

        URI peopleListUri = UriBuilder.fromUri("/people").build();
        Response response = Response.seeOther(peopleListUri).build();
        throw new WebApplicationException(response);
    }
}

