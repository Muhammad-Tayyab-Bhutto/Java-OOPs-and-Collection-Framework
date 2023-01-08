abstract class Movie {
    private String idNumber;
    private String movieTitle;
    double movieFee = 2;
    public abstract void calculateLateFee(int daysLate);
    public void equals(Movie movie1, Movie movie2){
        if (movie1.getIdNumber().equals(movie2.getIdNumber())){
            System.out.println("Movies are Same.");
        }
    }
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
}
class ActionMovie extends Movie {
    public void setIdNumber(String idNumber) {
        super.setIdNumber(idNumber);
    }
    public void setMovieTitle(String movieTitle) {
        super.setMovieTitle(movieTitle);
    }
    public void calculateLateFee(int daysLate) {
        System.out.println("Movie Fee after applying late fee is. " + ((movieFee+3) *daysLate));
    }
    public void equals(ActionMovie action_movie1, ActionMovie action_movie2) {
        super.equals(action_movie1, action_movie2);
    }
}

class CommedyMovie extends Movie {
    public void setIdNumber(String idNumber) {
        super.setIdNumber(idNumber);
    }
    public void setMovieTitle(String movieTitle) {
        super.setMovieTitle(movieTitle);
    }
    public void calculateLateFee(int daysLate) {
        System.out.println("Movie Fee after applying late fee is. " + ((movieFee+2.50) *daysLate));
    }
    public void equals(CommedyMovie commedy_movie1, CommedyMovie commedy_movie2) {
        super.equals(commedy_movie1, commedy_movie2);
    }
}

class Drama extends Movie {
    public void setIdNumber(String idNumber) {
        super.setIdNumber(idNumber);
    }
    public void setMovieTitle(String movieTitle) {
        super.setMovieTitle(movieTitle);
    }
    public void calculateLateFee(int daysLate) {
        System.out.println("Movie Fee after applying late fee is. " + ((movieFee+2) *daysLate));
    }
    public void equals(Drama drama1, Drama drama2) {
        super.equals(drama1, drama2);
    }
}
public class Rental {
    String idOfCustomer = "";
    int daysLate = 0;
    Rental (Movie movie, String idOfCustomer, int daysLate) {
        this.daysLate = daysLate;
        if (movie instanceof ActionMovie){
            ActionMovie action_movie = new ActionMovie();
            action_movie.setIdNumber("464");
            action_movie.setMovieTitle("Pata nhi");
            System.out.println("Customer Id. " + idOfCustomer);
            System.out.println("Movie Id. " + action_movie.getIdNumber());
            System.out.println("Movie Name. " + action_movie.getMovieTitle());
            System.out.println("Days Late " + daysLate);
            action_movie.calculateLateFee(daysLate);
        }
        else if (movie instanceof CommedyMovie){
            CommedyMovie commedy_movie = new CommedyMovie();
            System.out.println("Customer Id. " + idOfCustomer);
            System.out.println("Movie Id. " + commedy_movie.getIdNumber());
            System.out.println("Movie Name. " + commedy_movie.getMovieTitle());
            System.out.println("Days Late " + daysLate);
            commedy_movie.calculateLateFee(daysLate);
        }
        else {
            Drama drama = new Drama();
            drama.setIdNumber("464");
            drama.setMovieTitle("Koi Bhi");
            System.out.println("Customer Id. " + idOfCustomer);
            System.out.println("Drama Id. " + drama.getIdNumber());
            System.out.println("Drama Name. " + drama.getMovieTitle());
            System.out.println("Days Late " + daysLate);
            drama.calculateLateFee(daysLate);
        }
    }
    public static void main(String[] args) {
        Drama drama1 = new Drama();
        Drama drama2 = new Drama();
        ActionMovie action_movie = new ActionMovie();
        drama1.setIdNumber("464");
        drama2.setIdNumber("464");
        drama1.setMovieTitle("Koi Bhi");
        drama2.setMovieTitle("Pata nhi");
        action_movie.setIdNumber("464");
        action_movie.setMovieTitle("Pata nhi");

        drama2.equals(drama1, drama2);

        Rental rentalMovie = new Rental(action_movie,"465", 3);
        Rental rentalMovie2 = new Rental(drama2,"465", 3);

    }
}
