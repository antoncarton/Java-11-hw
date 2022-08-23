package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    @Test
    public void shouldAddMovies() {
        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");

        String[] actual = manager.findAll();
        String[] expected = {"movie1", "movie2", "movie3"};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldAddAMovie() {
        manager.add("movie1");

        String[] actual = manager.findAll();
        String[] expected = {"movie1"};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldReturnIfNotAddMovies() {

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldReturnResultMovies10() {


        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");
        manager.add("movie6");
        manager.add("movie7");
        manager.add("movie8");
        manager.add("movie9");
        manager.add("movie10");
        manager.add("movie11");
        manager.add("movie12");

        String[] actual = manager.findLast();
        String[] expected = {
                "movie12",
                "movie11",
                "movie10",
                "movie9",
                "movie8",
                "movie7",
                "movie6",
                "movie5",
                "movie4",
                "movie3"
        };

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldReturnResultIfAddMoviesAddedAboveTheLimit() {
        MovieManager manager = new MovieManager(5);

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");
        manager.add("movie6");
        manager.add("movie7");
        manager.add("movie8");
        manager.add("movie9");
        manager.add("movie10");

        String[] actual = manager.findLast();
        String[] expected = {
                "movie10",
                "movie9",
                "movie8",
                "movie7",
                "movie6"
        };

        Assertions.assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldReturnResultFilmsIfAddFilmsLessLimit() {

        manager.add("movie1");
        manager.add("movie2");
        manager.add("movie3");
        manager.add("movie4");
        manager.add("movie5");


        String[] actual = manager.findLast();
        String[] expected = {
                "movie5",
                "movie4",
                "movie3",
                "movie2",
                "movie1"
        };

        Assertions.assertArrayEquals(actual, expected);
    }
}


