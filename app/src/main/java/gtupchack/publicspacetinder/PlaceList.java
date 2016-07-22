package gtupchack.publicspacetinder;

public class PlaceList {

    private double latitude;
    private double longitude;
    private String username;

    public PlaceList() {

    }

    public PlaceList(double latitude, double longitude, String username) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.username = username;
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

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getUsername() {
        return username;
    }

}