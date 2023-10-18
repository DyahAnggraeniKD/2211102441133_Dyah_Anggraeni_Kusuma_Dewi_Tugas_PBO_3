import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Langit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Langit extends World
{

    /**
     * Constructor for objects of class Langit.
     * 
     */
    public Langit()
    {    
       super(800, 600, 1); 
        Random rnd = new Random();
        Boolean isRunning = false;
        for (int i=0; i<15; i++){
            int x = rnd.nextInt(this.getWidth()-1);
            int y = rnd.nextInt(this.getHeight()-1);
            Awan awan1 = new Awan();
            awan1.setRotation(75*rnd.nextInt(1));
            this.addObject(awan1, x, y);
        }
    }
}
