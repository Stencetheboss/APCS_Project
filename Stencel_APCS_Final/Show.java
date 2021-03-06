import java.net.URL;
import java.net.MalformedURLException;
/**
 * Write a description of class Show here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Show
{
    // instance variables - replace the example below with your own
    public int episodes;
    public String showName;
    public boolean airing;
    public String genre;
    public URL watchLoc;
    public int showStartYear;

    /**
     * Constructor for objects of class Show
     */
    public Show(String name, boolean stillAir, int eps, int startYear, String genre, String watchSpot)
    {
        episodes = eps;
        airing = stillAir;
        this.genre = genre;
        showName = name;
        showStartYear = startYear;
        try {
            watchLoc = new URL(watchSpot);
        } 
        catch (MalformedURLException e) {
            try {
                watchLoc = new URL("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
            } 
            catch (MalformedURLException z) {
                //you're boned mate
            }

        }

    }
}
