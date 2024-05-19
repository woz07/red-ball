package github.woz07.redball.objects.template;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/**
 * Ball.java
 *
 * The super class for all moving objects
 *
 * @author  woz07
 * @date    19/05/2024
 */

public class Entity
{
    // Base features of an entity
    private int hp;                 // The hp of the entity
    private int speed;              // The speed of the entity
    private double width, height;   // The dimensions of the entity
    private Vector2 position;       // The x & y of the entity
    private Texture image;          // The image to render of the entity
    
    public Entity(int hp, int width, int height, Vector2 position, Texture image)
    {
        this.hp       = hp;
        this.width    = width;
        this.height   = height;
        this.position = position;
        this.image    = image;
    }
    
    public int getHp() {
        return hp;
    }
    public void setHit(int hp)
    {
        this.hp = hp;
    }
    
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height = height;
    }
    
    public Vector2 getPosition()
    {
        return position;
    }
    public void setPosition(Vector2 position)
    {
        this.position = position;
    }
    
    public Texture getImage()
    {
        return image;
    }
    public void setImage(Texture image)
    {
        this.image = image;
    }
}
