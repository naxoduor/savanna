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
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    @NotNull
    @Column( name = "userName")
    String userName;
    
    @NotNull
    @Column( name = "email")
    String email;
    
    @NotNull
    @Column( name = "password")
    String password;
    
    public String getUserName() {
    return userName;
    }
    
    public void setUserName() {
    this.userName=userName;
    }
    
    public String getEmail() {
    return email;
    }
    
    public void setEmail() {
    this.email=email;
    }
    
    public String getPassword() {
    return password;
    }
    
    public void setPassword() {
    this.password=password;
    }
    
    @Override
         public String toString() {
         return "User [id="+id+ ", userName=" +userName+ ", email=" +email+ 
                 ", password="+password+ "]";
         }
}