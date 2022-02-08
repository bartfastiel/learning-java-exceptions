import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SchwarzmarktTest {
    @Test
    void expectIllegalArgumentException() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Schwarzmarkt.run();
                }
        );
    }

    @Test
    void expectIllegalArgumentException_otherSyntax() {
        try {
            Schwarzmarkt.run();
            Assertions.fail("Expected Exception not thrown");
        } catch (IllegalArgumentException e) {
            // perfect, we expected this exception
        } catch (Throwable t) {
            Assertions.fail("Other exception caught then expected");
        }
    }
}
