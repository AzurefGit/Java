package z2;

import javax.swing.text.View;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VideoGame game1 = new VideoGame("Rally", "Racing", LocalDate.parse("2025-09-01"));

        VideoGame game2;
        try {
            game2 = (VideoGame) game1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        game1.setReleaseDate(LocalDate.parse("2025-01-01"));

        System.out.println(game1.getReleaseDate());
        System.out.println(game2.getReleaseDate());
    }
}
