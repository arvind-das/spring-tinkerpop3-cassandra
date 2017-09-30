package com.neuron.domains;

import java.util.List;

public class Post {

    private String content;
    private List<Comment> comments;

    public Post() {
    }

    public String getContent() {

        return content;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
