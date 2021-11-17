import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void GCD() {
        assertEquals(31, Main.GCD(341, 217));
        assertEquals(15, Main.GCD(465, 165));
        assertEquals(29, Main.GCD(2030,899));
        assertEquals(2, Main.GCD(188,158));
    }
}