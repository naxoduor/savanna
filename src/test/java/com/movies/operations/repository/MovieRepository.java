/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.operations.repository;

/**
 *
 * @author maradona
 */
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import com.movies.operations.models.Movie;

@RestResource(exported = false)
public interface MovieRepository extends PagingAndSortingRepository<Movie, Long> {
    
}
