package com.neuron.domains;

import java.util.List;

public class User {

private long id;

private String name;

private long age;

private List<Post> posts;

    public User() {
    }

    public List<Post> getPosts() {

        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
