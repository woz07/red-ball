package github.woz07.redball;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import github.woz07.redball.objects.Player;

/**
 * Game.java
 *
 * The logic of the game
 *
 * @author	woz07
 * @date	19/05/2024
 */

public class Game extends ApplicationAdapter
{
	SpriteBatch batch;
	Player player;
	
	@Override
	public void create()
	{
		batch = new SpriteBatch();
		
		int testSpawnX = 150;
		int testSpawnY = 150;
		player = new Player(100, 10, 32, 32, new Vector2(testSpawnX, testSpawnY), new Texture("player.png"));
	}

	@Override
	public void render()
	{
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		batch.draw(player.getImage(), player.getPosition().x, player.getPosition().y);
		batch.end();
	}
	
	@Override
	public void dispose()
	{
		batch.dispose();
		player.getImage().dispose();
	}
}
