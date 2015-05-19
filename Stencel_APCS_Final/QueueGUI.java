import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Write a description of class QueueGUI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QueueGUI
{
    // instance variables - replace the example below with your own
    private JFrame frame;

    /**
     * Constructor for objects of class QueueGUI
     */
    public QueueGUI()
    {       
        frame = new JFrame ("Queue");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }

    public void display(){
        frame.pack();
        frame.setVisible(true);                  
    }
}
