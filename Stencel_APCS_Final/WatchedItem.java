
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

    public WatchedItem(String name, boolean stillAir, int eps, String startDay, String startMonth, String startYear, Genre genre, String watchSpot, double score)
    {
        super(name, stillAir, eps, startDay, startMonth, startYear, genre, watchSpot);
        rating = score;
    }

    public String getTitle()
    {
        return showName;
    }
    
    public double getRating()
    {
        return rating;        
    }
    
    public String getDate()
    {
        return showStartDate;
    }
    
    public int getEpisodes()
    {
        return episodes;
    }
}
