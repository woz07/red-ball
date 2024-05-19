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
    private boolean hit;            // If hit then game is over
    private double width, height;   // The dimensions of the entity
    private Vector2 position;       // The x & y of the entity
    private Texture image;          // The image to render of the entity
    
    public Entity(boolean hit, int width, int height, Vector2 position, Texture image)
    {
        this.hit       = hit;
        this.width    = width;
        this.height   = height;
        this.position = position;
        this.image    = image;
    }
    
    public boolean isHit() {
        return hit;
    }
    
    public void setHp(boolean hit) {
        this.hit = hit;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    public Vector2 getPosition() {
        return position;
    }
    
    public void setPosition(Vector2 position) {
        this.position = position;
    }
    
    public Texture getImage() {
        return image;
    }
    
    public void setImage(Texture image) {
        this.image = image;
    }
}
