package com.neuron.domains;

public class Comment {

    private String description;
    private User postedBy;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(User postedBy) {
        this.postedBy = postedBy;
    }

    public Comment(String description, User postedBy) {

        this.description = description;
        this.postedBy = postedBy;
    }
}
