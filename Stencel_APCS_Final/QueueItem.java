
/**
 * Write a description of class QueueItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QueueItem extends Show
{
    // instance variables - replace the example below with your own
     
    private double priority;

    /**
     * Constructor for objects of class QueueItem
     */
    public QueueItem(String name, boolean stillAir, int eps, int startYear, String genre, String watchSpot, double importance)
    {
        super(name, stillAir, eps, startYear, genre, watchSpot);
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

    public int getDate()
    {
        return showStartYear;
    }

    public int getEpisodes()
    {
        return episodes;
    }
    
    public boolean isAiring(){
        return airing;
    }
    
    public String getGenre(){
       return genre;
    }
    
    public void printShow(){        
      System.out.println("\t" + showName + "\t" + airing + "\t" + episodes + "\t" + showStartYear + "\t" + genre + "\t" + priority);  
    }
}
