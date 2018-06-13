package pl.pawel095.sokoban.movable;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public interface Movable {
	public void render(SpriteBatch batch,Vector2 size);
	public void spawn(Vector2 pos);
	public void move(int direction,int tiles);
}
