package github.woz07.redball.objects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import github.woz07.redball.objects.template.Entity;

/**
 * Bullet.java
 *
 * The class associated to the bullet
 */
public class Bullet extends Entity
{
    private final int damage = 25;
    public Bullet(Vector2 position)
    {
        super.setSpeed(400); // 2x faster than player, must
        super.setWidth(4); // real width of image
        super.setHeight(32); // real height of image
        super.setImage(new Sprite(new Texture("bullet.png")));
        super.setPosition(position);
    }
    
    /**
     * This is the method that makes the bullet move
     * Bullets only move along the Y axis
     *
     * @param delta Delta time
     * @param player The player which shot the bullet (to access player.removeBullet())
     */
    public void move(float delta, Player player)
    {
        if (getPosition().y + getSpeed() < Gdx.graphics.getHeight() - player.getHeight())
        {
            getPosition().y += getSpeed() * delta;
        }
        else
        {
            // Else it's hit top border and can't go further so de-spawn
            player.removeBullet(this);
        }
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    // Other setters and getters are available in the super class Entity.java
}
