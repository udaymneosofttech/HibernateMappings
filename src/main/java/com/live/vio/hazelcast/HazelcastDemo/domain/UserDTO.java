package com.live.vio.hazelcast.HazelcastDemo.domain;


import java.io.Serializable;

public class UserDTO implements Serializable{


    int id;

    String username;

    String add;

    public int getId() {
        return id;
    }

    public UserDTO setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getAdd() {
        return add;
    }

    public UserDTO setAdd(String add) {
        this.add = add;
        return this;
    }


}
