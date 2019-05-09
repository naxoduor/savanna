/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.operations.service;

/**
 *
 * @author maradona
 */
import com.movies.operations.models.Movie;
import com.movies.operations.repository.MovieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public
            void registerMovie(Movie movie) {
        movieRepository.save(movie);
    }

}
