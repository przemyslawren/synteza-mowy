import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        AudioPlayer audioPlayer = new AudioPlayer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst do odczytania: ");
        scanner.useDelimiter("\\n");
        String text = scanner.next();

        String[] splittedText = text.split("\\s+");

        for(String audioMessage : splittedText) {
            AudioPlayer.findAudio(audioMessage);
        }
    }
}