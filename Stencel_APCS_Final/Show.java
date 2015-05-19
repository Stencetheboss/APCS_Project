
/**
 * Write a description of class Show here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Show
{
    // instance variables - replace the example below with your own
    private int episodes;
    private String showName;
    private boolean airing;
    private Genre genre;
    private String watchLoc;
    private String showStartDate;

    /**
     * Constructor for objects of class Show
     */
    public Show(String name, boolean stillAir, int eps, String startDay, String startMonth, String startYear, Genre genre, String watchSpot)
    {
        episodes = eps;
        airing = stillAir;
        this.genre = genre;
        showName = name;
        showStartDate = startYear + startMonth + startDay;
        watchLoc = watchSpot;
    }


}
