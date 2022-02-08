import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Schlagloch {
    static void run() throws IOException {
        Files.readString(Paths.get("gibtsnicht.txt"));
    }
}
