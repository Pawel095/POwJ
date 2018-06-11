package pl.pawel095.sokoban.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import pl.pawel095.sokoban.AppPreferences;
import pl.pawel095.sokoban.Main;

public class PreferencesScreen extends basicScreen {

	private Stage stage;
	private AppPreferences prefs;

	private Label titleLabel;
	private Label volumeMusicLabel;
	private Label volumeSoundLabel;
	private Label musicOnOffLabel;
	private Label soundOnOffLabel;

	public PreferencesScreen(Main parent) {
		super(parent);
		stage = new Stage(new ScreenViewport());
	}

	@Override
	public void show() {
		prefs = AppPreferences.getInstance();
		Gdx.input.setInputProcessor(stage);

		// temp
		Skin skin = new Skin(Gdx.files.internal("skins-libgdx/gdx-holo/skin/uiskin.json"));

		Table table = new Table();
		table.setFillParent(true);
		//table.setDebug(true);
		stage.addActor(table);

		final Slider musicVolumeSlider = new Slider(0f, 1f, 0.1f, false, skin);
		musicVolumeSlider.setValue(prefs.getMusicVolume());
		musicVolumeSlider.addListener(new EventListener() {
			@Override
			public boolean handle(Event event) {
				prefs.setMusicVolume(musicVolumeSlider.getValue());
				return false;
			}
		});
		final CheckBox musicCheckBox = new CheckBox(null, skin);
		musicCheckBox.setChecked(prefs.getMusicEnabled());
		musicCheckBox.addListener(new EventListener() {

			@Override
			public boolean handle(Event event) {
				prefs.setMusicEnabled(musicCheckBox.isChecked());
				return false;
			}
		});
		final Slider soundVolumeSlider = new Slider(0f, 1f, 0.1f, false, skin);
		soundVolumeSlider.setValue(prefs.getSoundVolume());
		soundVolumeSlider.addListener(new EventListener() {

			@Override
			public boolean handle(Event event) {
				prefs.setSoundVolume(soundVolumeSlider.getValue());
				return false;
			}
		});
		final CheckBox soundCheckBox = new CheckBox(null, skin);
		soundCheckBox.setChecked(prefs.getSoundEnabled());
		soundCheckBox.addListener(new EventListener() {

			@Override
			public boolean handle(Event event) {
				prefs.setSoundEnabled(soundCheckBox.isChecked());
				return false;
			}
		});
		final TextButton backButton = new TextButton("Back", skin);
		backButton.addListener(new ChangeListener() {

			@Override
			public void changed(ChangeEvent event, Actor a) {
				parent.changeScreen(Main.MENU);
			}
		});

		titleLabel = new Label("Preferences", skin);
		volumeMusicLabel = new Label("Music Volume", skin);
		volumeSoundLabel = new Label("", skin);
		musicOnOffLabel = new Label(null, skin);
		soundOnOffLabel = new Label(null, skin);

		table.add(titleLabel);
		table.row();
		table.add(volumeMusicLabel);
		table.add(musicVolumeSlider);
		table.row();
		table.add(musicOnOffLabel);
		table.add(musicCheckBox);
		table.row();
		table.add(volumeSoundLabel);
		table.add(soundVolumeSlider);
		table.row();
		table.add(soundOnOffLabel);
		table.add(soundCheckBox);
		table.row();
		table.add(backButton);
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(153f, 153f, 153f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.draw();

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
		stage.clear();

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
