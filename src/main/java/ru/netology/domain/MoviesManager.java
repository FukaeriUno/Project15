package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.repository.Movie;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class MoviesManager {

    int limit = 10;

    private Movie[] movies = new Movie[0];

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

    public Movie[] getMovies() {
        int resultLength = limit;
        if (movies.length < limit) {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        int index = 0;
        for (int i = movies.length - 1; i >= 0; i--) {
            result[index] = movies[i];
            index++;
        }
        return result;
    }
}
