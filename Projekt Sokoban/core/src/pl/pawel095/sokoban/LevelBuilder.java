package pl.pawel095.sokoban;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;

import pl.pawel095.sokoban.loader.AssetLoader;
import pl.pawel095.sokoban.mapfile.MapFile;
import pl.pawel095.sokoban.movable.Barrel;
import pl.pawel095.sokoban.movable.Player;
import pl.pawel095.sokoban.tile.MapTileFactory;

public class LevelBuilder {
	public Level buildLevel(MapFile f, Vector2 camSize) {
		Level ret = new Level(f.getMapSize());
		Vector2 deltaSize = new Vector2(camSize.x / f.getMapSize().x, camSize.y / f.getMapSize().y);

		MapFile m = Main.getAssetLoader().manager.get(AssetLoader.level1);
		ArrayList<String> tiles = m.getStringTileList();
		ret = new Level(m.getMapSize());
		MapTileFactory factory = new MapTileFactory();
		int i = 0;
		for (String string : tiles) {
			ret.addMapTile(factory.getMapTile(string));

			// uwaga bo po wczytaniu oś y jest obrócona
			int col = (int) (i / f.getMapSize().x);
			int row = (int) (i % f.getMapSize().y);
			float x = deltaSize.x * (row - (int) (f.getMapSize().x / 2));
			float y = -1 * (deltaSize.y * (col - (int) (f.getMapSize().y / 2)));
			Vector2 pos = new Vector2(x, y);
			
			switch (string) {
			case "g":
				ret.spawnPlayer(new Player(), pos);
				break;
			case "s":
				ret.spawnBarrel(new Barrel(), pos);
			default:
				break;
			}
			i++;
		}
		return ret;
	}
}
