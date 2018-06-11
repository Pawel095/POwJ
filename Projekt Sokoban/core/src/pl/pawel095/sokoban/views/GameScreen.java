package pl.pawel095.sokoban.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;

import pl.pawel095.sokoban.Level;
import pl.pawel095.sokoban.Main;
import pl.pawel095.sokoban.controller.KeyboardConroller;

public class GameScreen extends basicScreen {

	private Level poziom;
	private OrthographicCamera cam;
	private Box2DDebugRenderer debugRenderer;
	private KeyboardConroller controller;
	
	public GameScreen(Main parent) {
		super(parent);
		cam = new OrthographicCamera(32,24);
		debugRenderer = new Box2DDebugRenderer(true,true,true,true,true,true);
		controller=new KeyboardConroller();
		poziom=new Level(controller);
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(controller);

	}

	@Override
	public void render(float delta) {
		poziom.logicStep(delta);
		Gdx.gl.glClearColor(0f, 0f, 0f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		debugRenderer.render(poziom.level, cam.combined);
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
