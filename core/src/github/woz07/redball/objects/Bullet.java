package github.woz07.redball.objects;

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
    public Bullet(int damage, int speed, int width, int height, Vector2 position, Sprite image)
    {
        super(damage, speed, width, height, position, image);
    }
}
