package pl.pawel095.sokoban.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.controller.KeyboardConroller;

public class GameScreen extends basicScreen {

	private KeyboardConroller controller;

	public GameScreen(Main parent) {
		super(parent);

		controller = new KeyboardConroller();
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(controller);

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0f, 0f, 0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
