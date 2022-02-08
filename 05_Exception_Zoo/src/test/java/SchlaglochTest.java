import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SchlaglochTest {
    @Test
    public void whenRun_expectIOException() {
        Assertions.assertThrows(
                IOException.class,
                () -> {
                    Schlagloch.run();
                }
        );
    }
}
