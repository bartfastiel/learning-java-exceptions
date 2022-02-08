import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacuumTest {
    @Test
    void whenRun_expectNullPointer() {
        Assertions.assertThrows(
                NullPointerException.class,
                () -> {
                    Vacuum.run();
                }
        );
    }
}
