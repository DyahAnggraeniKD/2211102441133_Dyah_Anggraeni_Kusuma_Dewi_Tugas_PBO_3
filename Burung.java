import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burung extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    
    private int frame = 1;
    private int animationDelay = 10;
    private int speed = 5; // Kecepatan gerakan Burung
    private int direction = 1; // 1 untuk bergerak ke atas, -1 untuk bergerak ke bawah

    public void act() {
        animate();
        // Gerakkan burung ke atas dan ke bawah
        setLocation(getX(), getY() + (speed * direction));
        
        // Ganti arah gerakan jika burung mencapai batas atas atau bawah
        if (getY() >= getWorld().getHeight() - 1) { // Batas bawah dunia
            direction = -1; // Ubah arah ke atas
        } else if (getY() <= 0) { // Batas atas dunia
            direction = 1; // Ubah arah ke bawah
        }
    }
    
    public Burung()
    {
        image1 = new GreenfootImage("1.png");
        image2 = new GreenfootImage("2.png");
        image3 = new GreenfootImage("3.png");
        setImage(image1);
    }
    
    private void animate()
    {
        if (frame == animationDelay)
        {
            switchImage();
            frame = 1;
        }
        else
        {
            frame++;
        }
    }

    private void switchImage()
    {
        if (getImage() == image1)
        {
            setImage(image2);
        }
        else if (getImage() == image2)
        {
            setImage(image3);
        }
        else
        {
            setImage(image1);
        }
    }
    
    private void moveBurung()
    {
        int x = getX();
        int y = getY();

        if (Greenfoot.mouseMoved(null))
        {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int mouseX = mouse.getX();
        int mouseY = mouse.getY();
        
        int deltaX = mouseX - x;
        int deltaY = mouseY - y;
        
        double angle = Math.toDegrees(Math.atan2(deltaY, deltaX));
        
        x += (int) (speed * Math.cos(Math.toRadians(angle)));
        y += (int) (speed * Math.sin(Math.toRadians(angle)));
        }

        setLocation(x, y);
    }
}
