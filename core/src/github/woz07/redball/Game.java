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
		
		int testSpawnX = 150;
		int testSpawnY = 150;
		Texture texture = new Texture("player.png");
		Sprite img = new Sprite(texture);
		img.setScale(2.5f); // for testing reasons this is still here
		player = new Player(100, 150, 32, 32, new Vector2(testSpawnX, testSpawnY), img);
	}
	
	@Override
	public void render()
	{
		ScreenUtils.clear(1, 1, 1, 1);
		
		ListenAndHandleInput(Gdx.graphics.getDeltaTime());
		
		batch.begin();
		
		player.getImage().setPosition(player.getPosition().x, (int) player.getImage().getScaleY() * 10 + 5); // scale * 10 + 5 just works
		// +4 gets feet right on borderline
		player.getImage().draw(batch);
		
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
	private void ListenAndHandleInput(float delta)
	{
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A)) {
			player.getPosition().x -= player.getSpeed() * delta;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D)) {
			player.getPosition().x += player.getSpeed() * delta;
		}
	}
}
