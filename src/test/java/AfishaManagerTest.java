import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AfishaManagerTest {

    @Test
    public void shouldFindAll() {
        AfishaManager afisha = new AfishaManager();
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = afisha.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastEqualLimit() {
        AfishaManager afisha = new AfishaManager(5);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");

        String[] expected = {"film5", "film4", "film3", "film2", "film1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastBelowLimit() {
        AfishaManager afisha = new AfishaManager(5);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");

        String[] expected = {"film4", "film3", "film2", "film1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAboveLimit() {
        AfishaManager afisha = new AfishaManager(5);
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");

        String[] expected = {"film6", "film5", "film4", "film3", "film2"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast() {
        AfishaManager afisha = new AfishaManager();
        afisha.addFilm("film1");
        afisha.addFilm("film2");
        afisha.addFilm("film3");
        afisha.addFilm("film4");
        afisha.addFilm("film5");
        afisha.addFilm("film6");
        afisha.addFilm("film7");
        afisha.addFilm("film8");
        afisha.addFilm("film9");
        afisha.addFilm("film10");

        String[] expected = {"film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2", "film1"};
        String[] actual = afisha.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
