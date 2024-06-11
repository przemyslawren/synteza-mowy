
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JFrame;

public class AudioPlayer extends JFrame {

    static JFXPanel fxpanel = new JFXPanel();
    private static Queue<String> audioQueue = new LinkedList<>();
    private static List<MediaPlayer> players = new LinkedList<>();

    private static void playSound(String sound) {
        audioQueue.add(sound);
        if (audioQueue.size() == 1) {
            playNext();
        }
    }

    private static void playNext() {
        if (!audioQueue.isEmpty()) {
            String sound = audioQueue.peek();
            final Media media = new Media(new File(sound).toURI().toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            players.add(mediaPlayer);
            mediaPlayer.setOnEndOfMedia(() -> {
                audioQueue.poll();
                players.remove(mediaPlayer);
                playNext();
            });
            mediaPlayer.play();
        }
    }

    public static void findAudio(String name) throws IOException {
        try(
                Stream<Path> filePathStream = Files.walk(Paths.get("src/audio/"))) {
                filePathStream
                    .filter(e -> e.getFileName().toString().contains(name))
                    .forEach(e -> {
                                String audioFilePath = e.toAbsolutePath().toString();
                        System.out.println(audioFilePath);
                                playSound(audioFilePath);
                            }
                    );

        }
    };
}
