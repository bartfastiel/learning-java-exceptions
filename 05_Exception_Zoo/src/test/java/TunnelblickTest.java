import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TunnelblickTest {
    @Test
    void whenRun_expectStackOverflow() {
        Assertions.assertThrows(
                StackOverflowError.class,
                () -> {
                    Tunnelblick.run();
                }
        );
    }
}
