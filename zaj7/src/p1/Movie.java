package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie>{
    public String title;
    public String director;
    public String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
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

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Abc", "Def", "geh"));
        movies.add(new Movie("Be", "Def", "geh"));
        movies.add(new Movie("E", "Heh", "geh"));
        movies.add(new Movie("Ceee", "Bli", "geh"));

        Collections.sort(movies);
        System.out.println(movies);
    }
}
