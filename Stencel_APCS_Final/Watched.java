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
    // instance variables - replace the example below with your own
    private ArrayList<WatchedItem> watchedList;

    /**
     * Constructor for objects of class Watched
     */
    public Watched()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sortAlphabticallyAZ()
    {
        for (int i =1; i< watchedList.size(); i++){
            String a = watchedList.get(i-1).getTitle();
            String b = watchedList.get(i).getTitle();
            if(a.compareTo( b) < 0){
                WatchedItem temp1 = watchedList.get(i-1);
                WatchedItem temp2 = watchedList.get(i);                
                watchedList.set(i, temp1);
                watchedList.set(i-1, temp2);
                i--;
            }
        }        
    }

    public void sortAlphabticallyZA()
    {
        for (int i =1; i< watchedList.size(); i++){
            String a = watchedList.get(i-1).getTitle();
            String b = watchedList.get(i).getTitle();
            if(a.compareTo( b) > 0){
                WatchedItem temp1 = watchedList.get(i-1);
                WatchedItem temp2 = watchedList.get(i);                
                watchedList.set(i, temp1);
                watchedList.set(i-1, temp2);
                i--;
            }
        }          
    }

    public void sortByRatingLH()
    {
        for (int i =1; i< watchedList.size(); i++){
            double a = watchedList.get(i-1).getRating();
            double b = watchedList.get(i).getRating();
            if(a > b){
                WatchedItem temp1 = watchedList.get(i-1);
                WatchedItem temp2 = watchedList.get(i);                
                watchedList.set(i, temp1);
                watchedList.set(i-1, temp2);
                i--;
            }
        } 
    }

    public void sortByRatingHL()
    {
        for (int i =1; i< watchedList.size(); i++){
            double a = watchedList.get(i-1).getRating();
            double b = watchedList.get(i).getRating();
            if(a < b){
                WatchedItem temp1 = watchedList.get(i-1);
                WatchedItem temp2 = watchedList.get(i);                
                watchedList.set(i, temp1);
                watchedList.set(i-1, temp2);
                i--;
            }
        }
    }

    public void sortByDateON()
    {
        for (int i =1; i< watchedList.size(); i++){
            String a = watchedList.get(i-1).getDate();
            String b = watchedList.get(i).getDate();
            if(a.compareTo( b) < 0){
                WatchedItem temp1 = watchedList.get(i-1);
                WatchedItem temp2 = watchedList.get(i);                
                watchedList.set(i, temp1);
                watchedList.set(i-1, temp2);
                i--;
            }
        }       
    }
    
    public void sortByDateNO()
    {
        for (int i =1; i< watchedList.size(); i++){
            String a = watchedList.get(i-1).getDate();
            String b = watchedList.get(i).getDate();
            if(a.compareTo(b) > 0){
                WatchedItem temp1 = watchedList.get(i-1);
                WatchedItem temp2 = watchedList.get(i);                
                watchedList.set(i, temp1);
                watchedList.set(i-1, temp2);
                i--;
            }
        }       
    }

    public void sortByEpisodesLS()
    {
        for (int i =1; i< watchedList.size(); i++){
            int a = watchedList.get(i-1).getEpisodes();
            int b = watchedList.get(i).getEpisodes();
            //if a has less episodes than b switch them
            if(a < b){
                WatchedItem temp1 = watchedList.get(i-1);
                WatchedItem temp2 = watchedList.get(i);                
                watchedList.set(i, temp1);
                watchedList.set(i-1, temp2);
                i--;
            }
        }
    }

    public void sortByEpisodesSL()
    {
        for (int i =1; i< watchedList.size(); i++){
            int a = watchedList.get(i-1).getEpisodes();
            int b = watchedList.get(i).getEpisodes();
            //if a has less episodes than b switch them
            if(a > b){
                WatchedItem temp1 = watchedList.get(i-1);
                WatchedItem temp2 = watchedList.get(i);                
                watchedList.set(i, temp1);
                watchedList.set(i-1, temp2);
                i--;
            }
        }
    }
}
