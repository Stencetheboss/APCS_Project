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
        //         QueueGUI queue1 = new QueueGUI();
        //         queue1.display();
        //         WatchedGUI watched1 = new WatchedGUI();
        //         watched1.display();
        boolean cont = true;
        
        scan = new Scanner(System.in);
        System.out.println("NOTE, YOU MAY WANT TO RESIZE THIS WINDOW TO SEE ALL INFORMATION");
        System.out.println("Your current watched list and Queue are empty" + "/n" + "*************");
        while (cont){
            System.out.println("Would you like to add a show to your queue, your, watched list, or exit? (Q/W/anything else)");
            String choice = scan.next();
            if(scan.equals("Q") || scan.equals("q")){

            }
            else if(scan.equals("W") || scan.equals("w")){

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
