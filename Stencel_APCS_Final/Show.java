
/**
 * Write a description of class Show here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Show
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
    public Show(String name, boolean stillAir, int eps, String startDate, Genre genre, String watchSpot)
    {
        episodes = eps;
        airing = stillAir;
        this.genre = genre;
        showName = name;
        showStartDate = startDate;
        watchLoc = watchSpot;
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
