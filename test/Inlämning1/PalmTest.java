package Inlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {
    Palm p = new Palm("Baggio", 2);

    @Test
    void getNamn() {
    }

    @Test
    void getLängd() {
    }

    @Test
    void getVattenmängd() {
        assert (p.getVattenmängd() == 1);
        assert (p.getVattenmängd() != 43);
    }
}