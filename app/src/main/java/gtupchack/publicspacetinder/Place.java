package gtupchack.publicspacetinder;

public class Place {

    private String pname;
    private String address;
    private double latitude;
    private double longitude;
    private String city;
    private String filter; //the type of public space

    public Place() {

    }

    public Place(String name, String address, double latitude,
                 double longitude, String city, String filter) {
        this.pname = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
        this.filter = filter;
    }

    public void setPname(String string) {
        this.pname = string;
    }

    public void setAddress(String string) {
        this.address = string;
    }

    public void setLatitude(double number) {
        this.latitude = number;
    }

    public void setLongitude(double number) {
        this.longitude = number;
    }

    public void setCity(String string) {
        this.city = string;
    }

    public void setFilter(String string) {
        this.filter = string;
    }

    public String getPname() {
        return pname;
    }

    public String getAddress() {
        return address;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getCity() {
        return city;
    }

    public String getFilter() {
        return filter;
    }
}