package github.woz07.redball.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
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
    public Player(int hp, int width, int height, Vector2 position, Texture image) {
        super(hp, width, height, position, image);
    }
}
