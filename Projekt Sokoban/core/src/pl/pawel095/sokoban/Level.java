package pl.pawel095.sokoban;

import java.lang.management.ManagementPermission;
import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import pl.pawel095.sokoban.movable.Barrel;
import pl.pawel095.sokoban.movable.Player;
import pl.pawel095.sokoban.tile.MapTile;

public class Level {
	
	private ArrayList<MapTile> map;
	private Vector2 size;
	
	public Level(Vector2 size) {
		this.size=size;
	}
	
	public void addMapTile(MapTile m) {
		map.add(m);
	}
	
	public void spawnPlayer(Player p,Vector2 pos) {
		
	}
	
	public void spawnBarrel(Barrel b,Vector2 pos) {
		
	}
	public void draw(SpriteBatch batch,Vector2 camSize) {
		Vector2 deltaSize=new Vector2(camSize.x/size.x,	camSize.y/size.y);
		Vector2 currentPos=new Vector2(-1*(camSize.x/2),-1*(camSize.y/2));
		for (MapTile mapTile : map) {
			batch.draw(mapTile.getSprite(), currentPos.x,currentPos.y);
			currentPos.add(deltaSize);
		}
	}
	
}
