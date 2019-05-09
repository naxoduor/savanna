/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.operations.controllers;

/**
 *
 * @author maradona
 */
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movies.operations.service.MovieService;
import com.movies.operations.models.Movie;
import com.movies.operations.service.MovieService;


@RestController
public class MoviesController {
    
    @Autowired
    MovieService movieService;
    
    @PostMapping(path = "/api/registermovie")
  public ResponseEntity<?> registerPanel(@RequestBody Movie movie) {
    movieService.registerMovie(movie);
    return  ResponseEntity.accepted().build();
  }
    
}
