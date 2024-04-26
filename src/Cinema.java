public class Cinema{
    String name;
    String user;
    String email;
    String password;
    String studioType;
    String movieTitle;
    String [] movieGenres;
    double movieRanting;
    int studioNumber;
    char row;
    int col;
    int displayStudioDetail;
    int [] listUser;
    int [] listStudio;
    int studioCapacity;

    public void Cinema(String a, int b) {
        this.name = a;
        this.studioCapacity = b;
    }
    private void init() { }

    public void registerUser(String User) {
        this.user = User;
    }

    public void authenticateUser(String e, String p) {
        this.email = e;
        this.password = p;
    }

    public void displayListStudio() { }

    public void displayStudioDetail(int s) {
        this.displayStudioDetail = s;
    }

    public void addStudioWithMovies(String t, String m, double r, String[] g) {
        this.studioType = t;
        this.movieTitle = m;
        this.movieRanting = r;
        this.movieGenres = g;
    }

    public void bookTicket(String User, int sn, char w, int l) {
        this.user = User;
        this.studioNumber = sn;
        this.row = w;
        this.col = l;
    }

    public void getName() { }
}