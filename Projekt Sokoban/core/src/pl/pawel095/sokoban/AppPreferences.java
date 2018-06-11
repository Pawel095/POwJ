package pl.pawel095.sokoban;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;

public class AppPreferences {
	//singleton!
	private static AppPreferences INSTANCE=null;
	
	private static final String PREF_MUSIC_VOLUME = "volume";
	private static final String PREF_MUSIC_ENABLED = "music.enabled";
	private static final String PREF_SOUND_ENABLED = "sound.enabled";
	private static final String PREF_SOUND_VOLUME = "sound";
	private static final String PREFS_NAME = "sokoban";
	
	public static AppPreferences getInstance() {
		if (INSTANCE==null) {
			INSTANCE=new AppPreferences();
		}
		return INSTANCE;
	}
	private AppPreferences() {};
	
	protected Preferences getPrefs() {
		return Gdx.app.getPreferences(PREFS_NAME);
	}
	
	public float getMusicVolume() {
		return getPrefs().getFloat(PREF_MUSIC_VOLUME,0.5f);
	}
	public float getSoundVolume() {
		return getPrefs().getFloat(PREF_SOUND_VOLUME,0.5f);
	}
	
	public boolean getMusicEnabled() {
		return getPrefs().getBoolean(PREF_MUSIC_ENABLED,true);
	}
	public boolean getSoundEnabled() {
		return getPrefs().getBoolean(PREF_SOUND_ENABLED,true);
	}
	
	public void setMusicVolume(float v) {
		getPrefs().putFloat(PREF_MUSIC_VOLUME, v);
		getPrefs().flush();
	}
	public void setSoundVolume(float s) {
		getPrefs().putFloat(PREF_SOUND_VOLUME, s);
		getPrefs().flush();
	}
	public void setMusicEnabled(boolean s) {
		getPrefs().putBoolean(PREF_MUSIC_ENABLED, s);
		getPrefs().flush();
	}
	public void setSoundEnabled(boolean s) {
		getPrefs().putBoolean(PREF_SOUND_ENABLED, s);
		getPrefs().flush();
	}
}
