package com.khadija1elle.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    public List<Movie> findAllMovies() {
        List<Movie> movies = repository.findAll();
        if (movies == null) {
            throw new RuntimeException("Aucune donnée trouvée dans la collection des films.");
        }
        return movies;
    }
    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return repository.findMovieByImdbId(imdbId);
    }

}
