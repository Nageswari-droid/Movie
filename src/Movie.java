import java.util.*;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movieArray) {
        ArrayList<Movie> PGMovieList = new ArrayList<>();

        for (Movie movie : movieArray) {
            if (movie.rating.contains("PG")) {
                PGMovieList.add(movie);
            }
        }

        return PGMovieList.toArray(new Movie[PGMovieList.size()]);
    }

    public static void printMovies(Movie[] MovieArrayList) {
        for (Movie movie : MovieArrayList) {

            System.out.println(
                    "Title : " + movie.title + "\n" + "Studio : " + movie.studio + "\n" + "Rating : " + movie.rating
            );
            System.out.println();

        }
    }

    public static void main(String args[]) {

        Movie movieOne = new Movie("Casino Royale", "Eon Productions", "PG-13");

        Movie movieTwo = new Movie("The Dark Knight", "Warner Bros");

        Movie movieThree = new Movie("The Departed", "Warner Bros", "R");

        Movie movieFour = new Movie("The shawshank Redemption", "Columbia Pictures", "R");

        Movie movieFive = new Movie("Kung fu panda", "Dreamworks");

        Movie[] movieArray = {movieOne, movieTwo, movieThree, movieFour, movieFive};

        Movie[] PGRatedMovies = getPG(movieArray);
        printMovies(PGRatedMovies);
    }
}
