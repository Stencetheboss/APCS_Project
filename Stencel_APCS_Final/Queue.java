import java.util.*;

/**
 * Write a description of class Queue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queue
{
    private ArrayList<QueueItem> showQueue;

    /**
     * Constructor for objects of class Queue
     */
    public Queue()
    {
        showQueue = new ArrayList <QueueItem>();
    }
    
    public void add(String name, boolean stillAir, int eps, int startYear, Genre genre, String watchSpot, double importance){
        QueueItem item = new QueueItem(name, stillAir, eps, startYear, genre, watchSpot, importance);
        showQueue.add(item);
    }

    public void sortByEpisodesSL()
    {
        for (int i =1; i< showQueue.size(); i++){
            double a = showQueue.get(i-1).getPriority();
            double b = showQueue.get(i).getPriority();
            //if a has less episodes than b switch them
            if(a > b){
                QueueItem temp1 = showQueue.get(i-1);
                QueueItem temp2 = showQueue.get(i);                
                showQueue.set(i, temp1);
                showQueue.set(i-1, temp2);
                i--;
            }
        }
    }

    public void print(){
        String air = "completed";
        for (int i =0; i< showQueue.size(); i++){
            String name = showQueue.get(i).getTitle();
            int eps = showQueue.get(i).getEpisodes();
            int date = showQueue.get(i).getDate();
            String genre = showQueue.get(i).getGenre();
            double priority = showQueue.get(i).getPriority();
            System.out.println("Your Show Queue");
            if (showQueue.get(i).isAiring())
            air = "airing";
            else
            air = "completed";
            System.out.println(i + "t/" + name + "t/" + air + "t/" + eps + "t/" + date + "t/" + genre + "t/" + priority);
        }
        System.out.println("***************************************");
    }

}
