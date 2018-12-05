package com.live.vio.hazelcast.HazelcastDemo.domain;

import java.io.Serializable;

public class BeamDetailsDTO   implements Serializable {

    int id;
    String name;
    String title;
    String description;

    public int getId() {
        return id;
    }

    public BeamDetailsDTO setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BeamDetailsDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BeamDetailsDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public BeamDetailsDTO setDescription(String description) {
        this.description = description;
        return this;
    }
}
