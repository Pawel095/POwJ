package pl.pawel095.sokoban.movable;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.loader.AssetLoader;

public class Player implements Movable {

	public final static int UP = -1;
	public final static int DOWN = 0;
	public final static int LEFT = 2;
	public final static int RIGHT = 3;

	private Vector2 pos;
	private Animation<TextureRegion> walkAnimation;
	private Animation<TextureRegion> spawnAnimation;
	private Texture idle;

	private boolean animating = false;
	private float animationState = 0f;
	private Animation<TextureRegion> currentAnimation;

	public Player() {
		walkAnimation = new Animation<TextureRegion>(1 / 30f,
				Main.getAssetLoader().manager.get(AssetLoader.playerWalk, TextureAtlas.class).getRegions());
		spawnAnimation = new Animation<TextureRegion>(1 / 30f,
				Main.getAssetLoader().manager.get(AssetLoader.playerSpawn, TextureAtlas.class).getRegions());
		idle = Main.getAssetLoader().manager.get(AssetLoader.playerIdle);
	}

	@Override
	public void spawn(Vector2 pos) {
		this.pos = pos;
		if (!animating) {
			currentAnimation = spawnAnimation;
			animationState = 0f;
			animating = true;
		}
	}

	@Override
	public void render(SpriteBatch batch, Vector2 size) {
		animationState += Gdx.graphics.getDeltaTime();
		if (currentAnimation.isAnimationFinished(animationState)) {
			animating = false;
		}
		if (animating) {
			TextureRegion currentFrame = currentAnimation.getKeyFrame(animationState);
			batch.draw(currentFrame, pos.x - size.x / 2, pos.y - size.y / 2, size.x, size.y);
		} else {
			batch.draw(idle, pos.x - size.x / 2, pos.y - size.y / 2, size.x, size.y);
		}
	}

	@Override
	public void move(int direction, int tiles) {
		// TODO Auto-generated method stub

	}
}
