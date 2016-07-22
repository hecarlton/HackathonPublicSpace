package gtupchack.publicspacetinder;

public class Viewed {

    private double latitude;
    private double longitude;
    private String username;
    private int seen;

    public Viewed() {

    }

    public Viewed(double latitude, double longitude, String username) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.username = username;
        this.seen = 0;
    }

    public Viewed(double latitude, double longitude, String username, int seen) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.username = username;
        this.seen = seen;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSeen(int seen) {
        this.seen = seen;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getUsername() {
        return username;
    }

    public int getSeen() {
        return seen;
    }

}
