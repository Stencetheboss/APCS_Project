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
    private ArrayList<WatchedItem> watchedList;

    /**
     * Constructor for objects of class Watched
     */
    public Watched()
    {
        watchedList = new ArrayList <WatchedItem>();
        WatchedItem item = new WatchedItem("placeholder", false, 0, 0000, "placeholder", "placeholder", 0);
        watchedList.add(item);
    }

    public void add(String name, boolean stillAir, int eps, int startYear, String genre, String watchSpot, double score){
        WatchedItem item = new WatchedItem(name, stillAir, eps, startYear, genre, watchSpot, score);
        watchedList.add(item);
    }

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
            int a = watchedList.get(i-1).getDate();
            int b = watchedList.get(i).getDate();
            if(a > b){
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
            int a = watchedList.get(i-1).getDate();
            int b = watchedList.get(i).getDate();
            if(a < b){
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

    public void print(){
        String air = "completed";
        System.out.println("\n" + "Your List of Watched Shows");
        for (int i =1; i< watchedList.size(); i++){
            String name = watchedList.get(i).getTitle();
            int eps = watchedList.get(i).getEpisodes();
            int date = watchedList.get(i).getDate();
            String genre = watchedList.get(i).getGenre();
            double rating = watchedList.get(i).getRating();

            System.out.println(i + "\t" + name + "\t" + air + "\t" + eps + "\t" + date + "\t" + genre + "\t" + rating);

        }
        System.out.println("***************************************");
    }
}
