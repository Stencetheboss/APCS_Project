
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
    public QueueItem(String name, boolean stillAir, int eps, String startDate, Genre genre, String watchSpot, double importance)
    {
        super(name, stillAir, eps, startDate, genre, watchSpot);
        priority = importance;
    }


}
