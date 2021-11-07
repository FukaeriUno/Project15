package ru.netology.domain;

import ru.netology.repository.Movie;

public class MoviesManager {

    int limit = 10;

    public MoviesManager() {
    }

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    private Movie[] movies = new Movie[0];

    public Movie[] getMovies() {
        return movies;
    }

    public void add(Movie item) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        movies = tmp;
    }

    public Movie[] getLastMovies() {
        int resultLength = limit;
        if (movies.length < limit) {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        int index = 0;
        for (int i = movies.length - 1; index < resultLength; i--) {
            result[index] = movies[i];
            index++;
        }
        return result;
    }
}
