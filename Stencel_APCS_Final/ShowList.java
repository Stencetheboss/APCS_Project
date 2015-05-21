import java.util.*;
/**
 * Write a description of class ShowList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShowList
{
    private static Scanner scan;
    private static Queue showQueue = new Queue();
    private static Watched watchList = new Watched();
    public static void main (String[] args)
    {
        boolean cont = true;        
        scan = new Scanner(System.in);
        System.out.println("NOTE, YOU MAY WANT TO RESIZE THIS WINDOW TO SEE ALL INFORMATION");
        System.out.println("Your current watched list and Queue are empty" + "/n" + "*************");

        int episodes;
        String showName;
        boolean airing = false;
        String tempBoolString;
        Genre genre;
        String watchLoc;
        
        int startYear; 
        double rating; 
        double priority;

        while (cont){
            System.out.println("Would you like to add a show to your queue, your, watched list, print your lists, or exit? (Q/W/P/anything else)");
            String choice = scan.next();
            if(scan.equals("Q") || scan.equals("q")){
                //title
                System.out.println("Title?");
                showName = scan.next();
                
                //airing check
                System.out.print("is the show still airing? (Y/N)");
                tempBoolString = scan.next();
                while (!tempBoolString.equals("Y") && !tempBoolString.equals("y") &&!tempBoolString.equals("N") && !tempBoolString.equals("n")){
                    System.out.println("Invalid, please enter Y or N");
                    tempBoolString = scan.next();
                }
                if (scan.next().equals("Y") || scan.next().equals("y"))
                    airing = true;
                    else if (scan.next().equals("N") || scan.next().equals("n"))
                    airing = false;

                    // episodes
                System.out.println("Number of Episodes?");
                episodes = scan.nextInt();
                
                //date
                System.out.println("What year is the show from?");
                startYear = scan.nextInt();
                
                //genre
                System.out.println("What is the main genre of the show?");
                genre = new Genre(scan.next());
                
                //watchSpot
                System.out.println("Where do you watch the show from? (if a website, copy/paste an URL!)");
                watchLoc = scan.next();
                
                //rating
                System.out.println("Give the show an arbtrary rating of how good you thought it was (decimals ok)");
                rating = scan.nextDouble();
                
                //add item
                showQueue.add(showName, airing, episodes, startYear, genre, watchLoc, rating);
            }
            else if(scan.equals("W") || scan.equals("w")){
                
            }
            else if(scan.equals("P") || scan.equals("p")){
                printLists();
            }
            else {
                cont = false;
                printLists();
            }
        }
    }

    public static void printLists(){
        showQueue.print();
        watchList.print();
    }
}
