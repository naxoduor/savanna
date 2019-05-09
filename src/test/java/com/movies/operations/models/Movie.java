/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.operations.models;

/**
 *
 * @author maradona
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.lang.Nullable;

@Entity
@Table(name = "movie")

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    
    @NotNull
    @Column( name = "title")
    String title;
    
    @NotNull
    @Column( name = "description" )
    String description;
    
    @Column( name = "recommendation")
    String recommendation;
    
    @Column( name = "rating" )
    int rating;

    @Column( name = "watched" )
    boolean watched;
    
    
    public String getTitle() {
    return title;
    }
    
    public void setTitle() {
    this.title=title;
    }
    
    public String getDescription() {
    return description;
    }
    
    public void setDescription(String description) {
        this.description=description;
    }
    
    public String getRecommendation(){
    return recommendation;
    }
    
    public void setRecommendation() {
    this.recommendation=recommendation;
    }
    
    public int getRating() {
    return rating;
    }
    
    public void setRating(int rating){
    this.rating=rating;
    }
    
    public boolean getWatched() {
    return watched;
    }
    
    
    public void setWatched() {
    this.watched=watched;
    }
    
    @Override
         public String toString() {
         return "Movie [id="+id+ ", title=" +title+ ", description=" +description+ 
                 ", recommendation="+recommendation+ ", rating="+rating+ ", watched="+watched+"]";
         }
    
}
