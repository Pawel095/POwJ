package pl.pawel095.sokoban;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import pl.pawel095.sokoban.movable.Barrel;
import pl.pawel095.sokoban.movable.Player;
import pl.pawel095.sokoban.tile.MapTile;

public class Level {

	private ArrayList<MapTile> map;
	private Vector2 size;
	private Player player;
	private ArrayList<Barrel> barrel;

	public Level(Vector2 size) {
		this.size = size;
		map = new ArrayList<MapTile>();
		barrel = new ArrayList<Barrel>();
	}

	public void addMapTile(MapTile m) {
		map.add(m);
	}

	public void spawnPlayer(Player p, Vector2 pos) {
		this.player = p;
		p.spawn(pos);
	}

	public void spawnBarrel(Barrel b, Vector2 pos) {
		b.spawn(pos);
		barrel.add(b);
	}

	public void draw(SpriteBatch batch, Vector2 camSize) {
		Vector2 deltaSize = new Vector2(camSize.x / size.x, camSize.y / size.y);
		for (int i = 0; i < size.x; i++) {
			for (int j = 0; j < size.y; j++) {
				// oś y jest obrócona!
				batch.draw(getTile(i, (int) (size.y - j - 1)).getSprite(), i * deltaSize.x - (camSize.x / 2),
						j * deltaSize.y - (camSize.y / 2), deltaSize.x, deltaSize.y);
			}
		}
		player.render(batch, new Vector2(deltaSize.x * 1.5f, deltaSize.y * 1.5f));
		for (Barrel b : barrel) {
			b.render(batch, new Vector2(deltaSize.x * 1.5f, deltaSize.y * 1.5f));
		}
	}

	private MapTile getTile(int row, int col) {
		return map.get((int) (size.y * col + row));
	}

}
