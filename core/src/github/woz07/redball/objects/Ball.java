package github.woz07.redball.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import github.woz07.redball.objects.template.Entity;

/**
 * Ball.java
 *
 * The class associated to the red balls
 *
 * @author  woz07
 * @date    19/05/2024
 */

public class Ball extends Entity
{
    // Extra must have features of the ball class
    private Vector2 velocity;   // The velocity of the ball
    private double bounce;      // The bounce multiplier
    
    public Ball(int hp, int speed, int width, int height, Vector2 position, Sprite image) {
        super(hp, speed, width, height, position, image);
    }
    
    /**
     * Method to move ball to a new position
     * @param newPos The new position of the ball
     */
    public void move(Vector2 newPos)
    {
        this.setPosition(newPos);
    }
    
    public Vector2 getVelocity()
    {
        return velocity;
    }
    public void setVelocity(Vector2 velocity)
    {
        this.velocity = velocity;
    }
    
    public double getBounce()
    {
        return bounce;
    }
    public void setBounce(double bounce)
    {
        this.bounce = bounce;
    }
}