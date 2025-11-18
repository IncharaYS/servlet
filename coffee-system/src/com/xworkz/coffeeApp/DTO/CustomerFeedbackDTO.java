package com.xworkz.coffeeApp.DTO;


import java.io.Serializable;
import java.util.Objects;

public class CustomerFeedbackDTO implements Serializable,Comparable<CustomerFeedbackDTO> {


    private String name;
    private String email;
    private String comments;
    private double rating;

    public CustomerFeedbackDTO( String name, String email,String comments, double rating) {
        this.name = name;
        this.email = email;
        this.comments = comments;
        this.rating = rating;
    }
    public CustomerFeedbackDTO(){}

    @Override
    public String toString() {
        return "CustomerFeedbackDTO{" +
                "comments='" + comments + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CustomerFeedbackDTO that = (CustomerFeedbackDTO) o;
        return Double.compare(rating, that.rating) == 0 && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, comments, rating);
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(CustomerFeedbackDTO o) {
        return this.getName().compareTo(o.getName());
    }
}
