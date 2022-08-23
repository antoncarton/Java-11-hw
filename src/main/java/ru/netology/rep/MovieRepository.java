package ru.netology.rep;

import ru.netology.stats.Movies;

public class MovieRepository {
    private Movies[] movies = new Movies[0];

    public void save(Movies movie) {
        Movies[] tmp = new Movies[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }
    public Movies[] getMovieName(){
        return movies;
    }
    public Movies[] getId() {
        return movies;
    }
}
