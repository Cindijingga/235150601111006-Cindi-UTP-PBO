public class Studio {
    String Movie;
    String type;
    char row;
    int col;
    boolean[][] seats;

    public void Studio(String y) {
        this.type = y;
    }
    public void getStudioInfo() { }
    public void isBooked(char w, int l) {
       this. row = w;
        this.col = l;
    }
    public void reserve(char w, int l) {
        this.row = w;
        this.col = l;
    }
    public void getType() { }
    public void getMovie() { }
    public void setMovie(String Movie) { }
    private void setSeats() { }
}
