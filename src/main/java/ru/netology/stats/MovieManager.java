package ru.netology.stats;

import ru.netology.rep.MovieRepository;

public class MovieManager {
    protected String[] movies = new String[0];
    private int limit;


    public MovieManager() {
        this.limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film;
        movies = tmp;


    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int resultLenght;
        if (movies.length >= limit) {
            resultLenght = limit;
        } else {
            resultLenght = movies.length;
        }
        String[] result = new String[resultLenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}