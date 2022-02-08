import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReiseNachJerusalemTest {
    @Test
    void whenRun_expectIndexOutOfBounds() {
        Assertions.assertThrows(
                IndexOutOfBoundsException.class,
                () -> {
                    ReiseNachJerusalem.run();
                }
        );
    }
}
