package teilung;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ThrowableZoo {

    public static void main(String[] args) {
        methode1();
    }

    private static void methode1() {
        try {
            Files.readString(Path.of("farben.txt"));
        } catch (IOException e) {
            throw new RuntimeException("Farben konnten nicht geladen werden", e);
        }
    }

}
