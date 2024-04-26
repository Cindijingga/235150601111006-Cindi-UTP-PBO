public class Movie {
    String title;
    double rating;
    String [] genres;

    public void movie(String t, double r) {
        this.title = t;
        this.rating = r;
    }

    public void movie(String t, double r, String[] g) {
       this. title = t;
        this.rating = r;
        this.genres = g;
    } 
    public void getTitle() { }
    public void getRanting() { }
    public void getGenres() { }
    public void setGenres( String[] g) {
        this.genres = g;
    }
}
