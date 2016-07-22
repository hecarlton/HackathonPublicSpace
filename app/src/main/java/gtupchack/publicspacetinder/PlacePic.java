package gtupchack.publicspacetinder;

public class PlacePic {

    private double latitude;
    private double longitude;
    private String imageFile;

    public PlacePic(double latitude, double longitude, String imageFile) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.imageFile = imageFile;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getImageFile() {
        return imageFile;
    }
}