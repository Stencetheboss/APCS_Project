import java.util.*;

/**
 * Write a description of class Queue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queue
{
    // instance variables - replace the example below with your own
    private ArrayList<QueueItem> showQueue;

    /**
     * Constructor for objects of class Queue
     */
    public Queue()
    {

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

}
