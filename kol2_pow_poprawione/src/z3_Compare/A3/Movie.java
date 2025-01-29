package z3_Compare.A3;

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
        ArrayList<Movie> list = new ArrayList<>();

        list.add(new Movie("AA", "B", "F"));
        list.add(new Movie("B", "B", "F"));
        list.add(new Movie("DDD", "B", "F"));
        list.add(new Movie("CCCC", "B", "F"));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
