package sounds;

import config.ConfigurationGame;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class MainTheme extends Thread {

    String pathMainTheme = "src/sounds/GameCorner-GSC-Remix-PokeRemixStudio.wav";
    Media media = new Media(new File(pathMainTheme).toURI().toString());
    MediaPlayer mainTheme = new MediaPlayer(media);

    @Override
    public void run() {
        for(;;) {
            mainTheme.setVolume(ConfigurationGame.getVolume());
            mainTheme.setAutoPlay(true);
            mainTheme.setCycleCount(MediaPlayer.INDEFINITE);
            mainTheme.play();
        }

    }
}
