import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        this.setPaintOrder(Burung.class);
        addObject(new Burung(), 200, 500);
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
    
    private void prepare()
    {
        Burung burung = new Burung();
        addObject(burung,121,196);
        Beruang beruang = new Beruang();
        addObject(beruang,479,296);
    }
}

