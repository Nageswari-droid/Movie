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

    public static ArrayList<Movie> getPG(ArrayList<Movie> movieArrayList) {
        ArrayList<Movie> PGMovieList = new ArrayList<>();

        for (Movie movie : movieArrayList) {
            if (movie.rating.contains("PG")) {
                PGMovieList.add(movie);
            }
        }
        return PGMovieList;
    }

    public static void printMovies(ArrayList<Movie> MovieArrayList) {
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

        ArrayList<Movie> movieArray = new ArrayList<>(Arrays.asList(
                movieOne,
                movieTwo,
                movieThree,
                movieFour,
                movieFive
        ));

        ArrayList<Movie> PGRatedMovies = getPG(movieArray);
        printMovies(PGRatedMovies);
    }
}
