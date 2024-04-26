public class User {
    String email;
    String password;
    String fullName;
    double balance;
    boolean ticket;
    String [] tiketLists;

    
    public void User(String e, String p, String f, double b) {
        this.email = e;
        this.password = p;
        this.fullName = f;
        this.balance = b;
    }
    public void addTicket(boolean Ticket) {
       this. ticket = Ticket;
    }
    public void displayAllTickets() { }
    public void isMatch( String e, String p) {
        this.email = e;
        this.password = p;
    }
    public void getEmail() { }
    public void getPassword() { }
    public void getFullName() { }
    public void getBallance() { }
    public void setBalance(double b) {
        this.balance = b;
    }
}
