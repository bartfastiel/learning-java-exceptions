package teilung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeilungTest {

    @Test
    void expect5_whenDividing10By2() {
        int actual = Teilung.divide(10, 2);
        Assertions.assertEquals(5, actual);
    }

    @Test
    void expectArithmeticException_whenDividing5By0() {
        Assertions.assertThrows(
                ArithmeticException.class,
                () -> {
                    Teilung.divide(5, 0);
                }
        );
    }

    @Test
    void expectArithmeticException_whenDividing7By0() {
        boolean geschmissen = true;
        try {
            int actual = Teilung.divide(7, 0);
            geschmissen = false;
        } catch (ArithmeticException e) {
        }
        Assertions.assertTrue(geschmissen);
    }

}
