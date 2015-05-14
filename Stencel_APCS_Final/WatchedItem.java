
/**
 * Write a description of class WatchedItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WatchedItem extends Show
{
    // instance variables - replace the example below with your own
    private int episodes;
    private String showName;
    private boolean airing;
    private Genre genre;
    private String watchLoc;
    private String showStartDate;  
    private double rating;
    /**
     * Constructor for objects of class WatchedItem
     */
    public WatchedItem(String name, boolean stillAir, int eps, String startDate, Genre genre, String watchSpot, double score)
    {
        super(name, stillAir, eps, startDate, genre, watchSpot);
        rating = score;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return 0;
    }
}
