import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        new AudioPlayer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst do odczytania: ");
        scanner.useDelimiter("\\n");
        String text = scanner.next();

        String[] splitText = text.split("\\s+");

        for(String audioMessage : splitText) {
            AudioPlayer.findAudio(audioMessage);
        }
    }
}