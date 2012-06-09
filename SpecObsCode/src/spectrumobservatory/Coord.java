/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spectrumobservatory;

/**
 * Coordinate class for nodes
 * @author Joshua
 */
public class Coord {
    private double latitude;
    private double longitude;

    public Coord(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public boolean equals(Object obj) {
        if (! (obj instanceof Coord))
            return false;
        Coord newCoord = (Coord) obj;
        return newCoord.getLatitude() == this.getLatitude() && newCoord.getLongitude() == this.getLongitude();
    }

    public String toString() {
        //compiled code
        return "[" + latitude + "," + longitude + "]";
    }
}
