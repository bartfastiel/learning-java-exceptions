package teilung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NobodyPizzaTest {

    @Test
    void expectNullPointerException_whenOrderingPizzaFromNobody() {
        Assertions.assertThrows(
                NullPointerException.class,
                () -> {
                    NobodyPizza.run();
                }
        );
    }
}
