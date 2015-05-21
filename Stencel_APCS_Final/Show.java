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
    private int episodes;
    private String showName;
    private boolean airing;
    private Genre genre;
    private URL watchLoc;
    private int showStartYear;

    /**
     * Constructor for objects of class Show
     */
    public Show(String name, boolean stillAir, int eps, int startYear, Genre genre, String watchSpot)
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
