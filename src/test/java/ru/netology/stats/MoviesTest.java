package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.rep.MovieRepository;

public class MoviesTest {

    Movies movies1 = new Movies(1, 1999, "Зеленый слоник" , "Trash");
    Movies movies2 = new Movies(1, 1999, "Зеленый слоник" , "Trash");
    Movies movies3 = new Movies(1, 1999, "Зеленый слоник" , "Trash");
    Movies movies4 = new Movies(1, 1999, "Зеленый слоник" , "Trash");
    Movies movies5 = new Movies(1, 1999, "Зеленый слоник" , "Trash");
    Movies movies6 = new Movies(1, 1999, "Зеленый слоник" , "Trash");
    Movies movies7 = new Movies(1, 1999, "Зеленый слоник" , "Trash");
    Movies movies8 = new Movies(1, 1999, "Зеленый слоник" , "Trash");
    Movies movies9 = new Movies(1, 1999, "Зеленый слоник" , "Trash");
    Movies movies10 = new Movies(1, 1999, "Зеленый слоник" , "Trash");
    @Test
    public void test(){
        MovieRepository movies = new MovieRepository();
        movies.save(movies1);
        movies.save(movies2);
        movies.save(movies3);
        movies.save(movies4);
        movies.save(movies5);
        movies.save(movies6);
        movies.save(movies7);
        movies.save(movies8);
        movies.save(movies9);
        movies.save(movies10);

        Movies[] expected = {movies1 , movies2 , movies3 , movies4 , movies5 , movies6 , movies7 , movies8 , movies9 , movies10};
        Movies[] actual = movies.getMovieName();

        Assertions.assertArrayEquals(expected , actual);
    }
}
