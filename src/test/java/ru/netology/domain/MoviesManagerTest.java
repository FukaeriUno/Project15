package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.repository.Movie;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {

    MoviesManager manager = new MoviesManager();

    Movie movie1 = new Movie(1, "Bladshot", "Boevik", "href1");
    Movie movie2 = new Movie(2, "Vpered", "Horror", "href2");
    Movie movie3 = new Movie(3, "Mister&Misses Smith", "Romantic", "href3");
    Movie movie4 = new Movie(4, "Lubov i Golubi", "Boevik", "href4");
    Movie movie5 = new Movie(5, "50shadesOfGray", "Comedy", "href5");
    Movie movie6 = new Movie(6, "Drakula", "Horror", "href6");
    Movie movie7 = new Movie(7, "WhoAreYou?", "Boevik", "href7");
    Movie movie8 = new Movie(8, "MissYou", "Comedy", "href8");
    Movie movie9 = new Movie(9, "DinosaursPark", "Adventures", "href9");
    Movie movie10 = new Movie(10, "Mr. Sadman", "Horror", "href10");
    Movie movie11 = new Movie(11, "Duna", "Fantastic", "href11");

    @Test
    public void shouldAddMovie() {

        manager.add(movie3);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{movie3};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMoreThanOneMovie() {

        manager.add(movie1);
        manager.add(movie2);

        Movie[] actual = manager.getMovies();
        Movie[] expected = new Movie[]{movie1, movie2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnMovies() {

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{movie5, movie4, movie3, movie2, movie1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnMoviesLessThanLimit() {

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetLimit() {
        MoviesManager manager = new MoviesManager(12);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        Movie[] actual = manager.getLastMovies();
        Movie[] expected = new Movie[]{movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        assertArrayEquals(expected, actual);
    }
    }
