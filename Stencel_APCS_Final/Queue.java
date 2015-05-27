import java.util.*;

/**
 * Write a description of class Queue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Queue
{
    private ArrayList<QueueItem> q;
    /**
     * Constructor for objects of class Queue
     */
    public Queue()
    {
        q= new ArrayList <QueueItem>();                
    }
    
    public void add(QueueItem item){        
        q.add(item);
    }

    public void sortByEpisodesSL()
    {
        for (int i =1; i< q.size(); i++){
            double a = q.get(i-1).getPriority();
            double b = q.get(i).getPriority();
            //if a has less episodes than b switch them
            if(a > b){
                QueueItem temp1 = q.get(i-1);
                QueueItem temp2 = q.get(i);                
                q.set(i, temp1);
                q.set(i-1, temp2);
                i--;
            }
        }
    }

    public void print(){
        String air = "completed";
        System.out.println("\n" + "Your Queue" + "\n");
        System.out.println("place" + "\t" + "name" + "\t" + "still airing" + "\t" + "number of episodes" + "\t" + "year" + "\t" + "genre" + "\t" + "priority");
        for (int i =0; i< q.size(); i++){
            System.out.print (i+1);
            q.get(i).printShow();
        }
        System.out.println("***************************************");
    }

}
