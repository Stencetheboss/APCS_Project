
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
    private int showStartYear;  
    private double rating;

    public WatchedItem(String name, boolean stillAir, int eps, int startYear, Genre genre, String watchSpot, double score)
    {
        super(name, stillAir, eps, startYear, genre, watchSpot);
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
    
    public int getDate()
    {
        return showStartYear;
    }
    
    public int getEpisodes()
    {
        return episodes;
    }
    
    public String getGenre(){
       return genre.getGenre();
    }
}
