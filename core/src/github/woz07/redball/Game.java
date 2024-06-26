package github.woz07.redball;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import github.woz07.redball.objects.Bullet;
import github.woz07.redball.objects.Player;

/**
 * Game.java
 *
 * The logic of the game
 *
 * @author 	woz07
 * @date 	19/05/2024
 */

public class Game extends ApplicationAdapter
{
	SpriteBatch batch;
	Player player;
	
	@Override
	public void create()
	{
		batch = new SpriteBatch();
		
		int playerWidth = 32; // test reasons
		int testSpawnX = (Gdx.graphics.getWidth() / 2) - (playerWidth / 2); // so player spawns in the middle
		int testSpawnY = 0; // 0 as always set up by itself
		Texture texture = new Texture("player.png");
		Sprite img = new Sprite(texture);
		img.setScale(4f); // for testing reasons this is still here
		player = new Player(100, 200, 32, 32, new Vector2(testSpawnX, testSpawnY), img);
	}
	
	@Override
	public void render()
	{
		ScreenUtils.clear(1, 1, 1, 1);
		
		listenAndHandleInput(Gdx.graphics.getDeltaTime());
		
		batch.begin();
		
		player.getImage().setPosition(player.getPosition().x, (int) player.getImage().getScaleY() * 10 + 8); // +8 works for some odd reason
		player.getImage().draw(batch);
		
		// Move bullets
		if (player.getBullets() != null)
		{
			player.moveBullets(Gdx.graphics.getDeltaTime());
		}
		
		// Draw bullets
		for (Bullet bullet : player.getBullets())
		{
			bullet.getImage().setPosition(bullet.getPosition().x, bullet.getPosition().y);
			bullet.getImage().draw(batch);
		}
		
		batch.end();
	}
	
	@Override
	public void dispose()
	{
		batch.dispose();
		player.getImage().getTexture().dispose();
	}
	
	/**
	 * This method listens for and handles input, it's where all the input
	 * logic goes.
	 *
	 * @param delta Delta time
	 */
	private void listenAndHandleInput(float delta)
	{
		// MOVEMENT
		
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A))
		{
			if (player.getPosition().x - player.getWidth() > 0)
			{
				player.getPosition().x -= player.getSpeed() * delta;
			}
		}
		
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D))
		{
			if (player.getPosition().x + player.getWidth() * 2 < Gdx.graphics.getWidth())
			{
				player.getPosition().x += player.getSpeed() * delta;
			}
		}
		
		// SHOOTING
		
		if (Gdx.input.isKeyPressed(Input.Keys.SPACE))
		{
			player.spawnBullet();
		}
	}
}
