import java.util.*
;
/**
 * Write a description of class Watched here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Watched
{
    private ArrayList<WatchedItem> w;

    /**
     * Constructor for objects of class Watched
     */
    public Watched()
    {
        w = new ArrayList <WatchedItem>();        
    }

    public void add(WatchedItem item){
        w.add(item);
    }

    public void sortAlphabticallyAZ()
    {
        for (int i =1; i< w.size(); i++){
            String a = w.get(i-1).getTitle();
            String b = w.get(i).getTitle();
            if(a.compareTo( b) < 0){
                WatchedItem temp1 = w.get(i-1);
                WatchedItem temp2 = w.get(i);                
                w.set(i, temp1);
                w.set(i-1, temp2);
                i--;
            }
        }        
    }

    public void sortAlphabticallyZA()
    {
        for (int i =1; i< w.size(); i++){
            String a = w.get(i-1).getTitle();
            String b = w.get(i).getTitle();
            if(a.compareTo( b) > 0){
                WatchedItem temp1 = w.get(i-1);
                WatchedItem temp2 = w.get(i);                
                w.set(i, temp1);
                w.set(i-1, temp2);
                i--;
            }
        }          
    }

    public void sortByRatingLH()
    {
        for (int i =1; i< w.size(); i++){
            double a = w.get(i-1).getRating();
            double b = w.get(i).getRating();
            if(a > b){
                WatchedItem temp1 = w.get(i-1);
                WatchedItem temp2 = w.get(i);                
                w.set(i, temp1);
                w.set(i-1, temp2);
                i--;
            }
        } 
    }

    public void sortByRatingHL()
    {
        for (int i =1; i< w.size(); i++){
            double a = w.get(i-1).getRating();
            double b = w.get(i).getRating();
            if(a < b){
                WatchedItem temp1 = w.get(i-1);
                WatchedItem temp2 = w.get(i);                
                w.set(i, temp1);
                w.set(i-1, temp2);
                i--;
            }
        }
    }

    public void sortByDateON()
    {
        for (int i =1; i< w.size(); i++){
            int a = w.get(i-1).getDate();
            int b = w.get(i).getDate();
            if(a > b){
                WatchedItem temp1 = w.get(i-1);
                WatchedItem temp2 = w.get(i);                
                w.set(i, temp1);
                w.set(i-1, temp2);
                i--;
            }
        }       
    }

    public void sortByDateNO()
    {
        for (int i =1; i< w.size(); i++){
            int a = w.get(i-1).getDate();
            int b = w.get(i).getDate();
            if(a < b){
                WatchedItem temp1 = w.get(i-1);
                WatchedItem temp2 = w.get(i);                
                w.set(i, temp1);
                w.set(i-1, temp2);
                i--;
            }
        }       
    }

    public void sortByEpisodesLS()
    {
        for (int i =1; i< w.size(); i++){
            int a = w.get(i-1).getEpisodes();
            int b = w.get(i).getEpisodes();
            //if a has less episodes than b switch them
            if(a < b){
                WatchedItem temp1 = w.get(i-1);
                WatchedItem temp2 = w.get(i);                
                w.set(i, temp1);
                w.set(i-1, temp2);
                i--;
            }
        }
    }

    public void sortByEpisodesSL()
    {
        for (int i =1; i< w.size(); i++){
            int a = w.get(i-1).getEpisodes();
            int b = w.get(i).getEpisodes();
            //if a has less episodes than b switch them
            if(a > b){
                WatchedItem temp1 = w.get(i-1);
                WatchedItem temp2 = w.get(i);                
                w.set(i, temp1);
                w.set(i-1, temp2);
                i--;
            }
        }
    }

    public void print(){
        String air = "completed";
        System.out.println("\n" + "Your List of Watched Shows");
        for (int i =0; i< w.size(); i++){
            System.out.print (i+1);
            w.get(i).printShow();
        }
        System.out.println("***************************************");
    }
}
