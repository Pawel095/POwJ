package pl.pawel095.sokoban.movable;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.loader.AssetLoader;

public class Barrel implements Movable {
	private Vector2 pos;
	private Texture barrel;

	public Barrel() {
		barrel = Main.getAssetLoader().manager.get(AssetLoader.worldBarrel);
	}

	@Override
	public void spawn(Vector2 pos) {
		this.pos = pos;
	}

	@Override
	public void render(SpriteBatch batch, Vector2 size) {
		batch.draw(barrel, pos.x-size.x/2, pos.y-size.y/2, size.x, size.y);

	}

	@Override
	public void move(int direction, int tiles) {
		// TODO Auto-generated method stub
	}
}
