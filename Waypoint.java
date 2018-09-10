
/**
 * This is a class to represen tone waypoint from a METAL TMG file.
 *
 * @author Ryan Holland
 */
public class Waypoint
{
    private String label;
    private double lat;
    private double lng;
    
    //Constructor for 'Waypoint' object
    public Waypoint(String label, double lat, double lng){
        this.label = label;
        this.lat = lat;
        this.lng = lng;
    }
    
    public String getLabel(){
        return label;
    }
    
    public double getLat(){
        return lat;
    }
    
    public double getLng(){
        return lng;
    }
    
    public String toString(){
        return label + " (" + lat + ", " + lng + ")";
    }
}