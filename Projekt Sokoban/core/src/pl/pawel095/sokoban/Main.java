package pl.pawel095.sokoban;

import com.badlogic.gdx.Game;

import pl.pawel095.sokoban.views.EndScreen;
import pl.pawel095.sokoban.views.LoadingScreen;
import pl.pawel095.sokoban.views.GameScreen;
import pl.pawel095.sokoban.views.MenuScreen;
import pl.pawel095.sokoban.views.PreferencesScreen;

public class Main extends Game {

	private LoadingScreen loadingScreen;
	private PreferencesScreen preferencesScreen;
	private MenuScreen menuScreen;
	private GameScreen gameScreen;
	private EndScreen endScreen;
	
	public final static int MENU = 0;
	public final static int PREFERENCES = 1;
	public final static int APPLICATION = 2;
	public final static int ENDGAME = 3;
	
	
	@Override
	public void create() {
		loadingScreen = new LoadingScreen(this);
		setScreen(loadingScreen);
	}

	public void changeScreen(int screen) {
		//System.out.println("changeScreen: "+screen);
		switch (screen) {
		case MENU:
			if (menuScreen == null)
				menuScreen = new MenuScreen(this);
			this.setScreen(menuScreen);
			break;
		case PREFERENCES:
			if (preferencesScreen == null)
				preferencesScreen = new PreferencesScreen(this);
			this.setScreen(preferencesScreen);
			break;
		case APPLICATION:
			if (gameScreen == null)
				gameScreen = new GameScreen(this);
			this.setScreen(gameScreen);
			break;
		case ENDGAME:
			if (endScreen == null)
				endScreen = new EndScreen(this);
			this.setScreen(endScreen);
			break;
		}
	}
}
