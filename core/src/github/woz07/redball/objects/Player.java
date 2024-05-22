package github.woz07.redball.objects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import github.woz07.redball.objects.template.Entity;

/**
 * Ball.java
 *
 * The class associated to the player
 *
 * @author  woz07
 * @date    19/05/2024
 */

public class Player extends Entity
{
    private final Array<Bullet> bullets;
    public Player(int hp, int speed, int width, int height, Vector2 position, Sprite image)
    {
        super(hp, speed, width, height, position, image);
//        image.setScale(1.5f);     removed for testing reasons
        // I think I like 4f as scaled size
        bullets = new Array<>();
    }
    
    public Array<Bullet> getBullets() {
        return bullets;
    }
    
    /**
     * This is the method that moves all the bullets
     * @param delta Delta time
     */
    public void moveBullets(float delta)
    {
        for (Bullet bullet: bullets)
        {
            bullet.move(delta, this);
        }
    }
    
    /**
     * This method is used for spawning in a bullet, it pushes the new bullet to bullets.
     */
    public void spawnBullet()
    {
        // Spawn bullet at players head
        double headY = getPosition().y + (getHeight() / 2);
        Bullet bullet = new Bullet(new Vector2(getPosition().x, (int) headY)); // is getPosition().x == int?
        bullets.add(bullet);
    }
    
    /**
     * This method is used for removing a bullet from bullets
     */
    public void removeBullet(Bullet bullet)
    {
        // Search for bullet and remove
        for (int i = 0; i < bullets.size; i++)
        {
            if (bullets.get(i).equals(bullet))
            {
                bullets.removeIndex(i);
            }
        }
    }
}
