
/**
 * Write a description of class QueueItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QueueItem extends Show
{
    // instance variables - replace the example below with your own
    private int episodes;
    private String showName;
    private boolean airing;
    private Genre genre;
    private String watchLoc;
    private String showStartDate;  
    private double priority;

    /**
     * Constructor for objects of class QueueItem
     */
    public QueueItem(String name, boolean stillAir, int eps, String startDay, String startMonth, String startYear, Genre genre, String watchSpot, double importance)
    {
        super(name, stillAir, eps, startDay, startMonth, startYear, genre, watchSpot);
        priority = importance;
    }

    public String getTitle()
    {
        return showName;
    }

    public double getPriority()
    {
        return priority;        
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
