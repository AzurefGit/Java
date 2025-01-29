package nwm.Clone;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>{
    String title;
    String director;
    String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Movie o) {
        return Integer.compare(this.title.length(), o.title.length());
    }
}

class Main{
    public static void main(String[] args) {
        Movie movie1 = new Movie("Aag", "a", "sda");
        Movie movie2 = new Movie("Aagaaaaa", "a", "sda");
        Movie movie3 = new Movie("Aagaa", "a", "sda");
        Movie movie4 = new Movie("Aagaaa", "a", "sda");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        System.out.println(movies);
        Collections.sort(movies);
        System.out.println(movies);

    }
}
